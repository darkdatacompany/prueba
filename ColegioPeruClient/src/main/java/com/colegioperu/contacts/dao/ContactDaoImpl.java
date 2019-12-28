package com.colegioperu.contacts.dao;
/** 
 * 
 * @author Lizardo Rios Villavicencio 
 */  


import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import java.util.Optional;

import javax.sql.DataSource;

//import javax.sql.DataSource;

//import oracle.jdbc.OracleTypes;	//study oracle.type for mariadb
//import mariaDb

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.jdbc.core.SqlOutParameter;
import org.springframework.jdbc.core.namedparam.MapSqlParameterSource;
import org.springframework.jdbc.core.namedparam.SqlParameterSource;
import org.springframework.jdbc.core.simple.SimpleJdbcCall;
import org.springframework.stereotype.Repository;

import com.colegioperu.contacts.dto.Contact;
import com.colegioperu.util.ConstantDB;
//Clase para mappear listas
//import com.colegioperu.contacts.conf.ContactRowMapper;


@Repository
public class ContactDaoImpl implements ContactDao {

	protected final Log logger = LogFactory.getLog(ContactDaoImpl.class);
	
	@Autowired
	DataSource dataSource;
	
	@Autowired
	JdbcTemplate jdbcTemplate;
	
//	public void setDataSource(DataSource dataSource) {
//		this.dataSource = dataSource;
//		this.jdbcTemplate = new JdbcTemplate(dataSource);
//	}
	
//	public void setDataSource(DataSource dataSource) {
//		this.jdbcTemplate = new JdbcTemplate(dataSource);
//		this.jdbcTemplate.setResultsMapCaseInsensitive(true);
//	}
	
	/* Implementacion de los metodos */
	@Override
	public Optional<Contact> findById(Long id) {
		
		return jdbcTemplate.queryForObject("select * from contact where idcontact = ?",
                new Object[]{id},
                (rs, rowNum) -> 
						Optional.of(new Contact(
								rs.getLong("idcontact"),
								rs.getString("nombres"), 
								rs.getString("apepaterno") + " " + rs.getString("apematerno"), 
								rs.getString("telefono"), 
								rs.getString("correo")
						))
		);
			
	}
	
	@Override
	public Contact getContact(Long id) {
		SimpleJdbcCall jdbcCall = new SimpleJdbcCall(dataSource).withProcedureName("sp_get_row_contact");

		SqlParameterSource in = new MapSqlParameterSource().addValue("in_id", id);
		Map<String, Object> out = jdbcCall.execute(in);
	
		Contact contact = new Contact();
	  	
		contact.setId(id);
		contact.setFirstName((String) out.get("out_nombres"));
		contact.setLastName((String) out.get("out_paterno") + " " + (String) out.get("out_materno"));
		contact.setPhoneNumber((String) out.get("out_celular"));
		contact.setEmail((String) out.get("out_correo"));
	  
		return contact;      
	}
	
	@SuppressWarnings("unchecked")
	@Override
	public List<Contact> listContacts() {
		Collection<Contact> listContacts = new ArrayList<Contact>();
		SimpleJdbcCall jdbcCall = new SimpleJdbcCall(dataSource)
				.withProcedureName("sp_list_contact")
				.returningResultSet("contacts", new RowMapper<Contact>() {
					
					@Override
					public Contact mapRow(ResultSet rs, int rowNum) throws SQLException {
						Contact contact = new Contact();
						
						contact.setId(rs.getLong("idcontact"));
						contact.setFirstName(rs.getString("nombres"));
						contact.setLastName(rs.getString("apepaterno") + " " + rs.getString("apematerno"));
						contact.setPhoneNumber(rs.getString("telefono"));
						contact.setEmail(rs.getString("correo"));
						
						return contact;
					}
				});

		Map<String, Object> out = jdbcCall.execute();
		listContacts = (List<Contact>)out.get("contacts");
		logger.info("lista contactos: " + listContacts);
		
		return (List<Contact>) listContacts;
	}
	
	@Override
	public Contact saveAndFlush(Contact contact) {
		
		SimpleJdbcCall simpleJdbcCall = new SimpleJdbcCall(this.jdbcTemplate)
										.withSchemaName(ConstantDB.SCH_COLEGIO)
							  			.withProcedureName(ConstantDB.SP_GET_STUDENT)
					  					.declareParameters(new SqlOutParameter("MESSAGE", 2));
			
		MapSqlParameterSource params = new MapSqlParameterSource().addValue("MESSAGE", null, 2);
			
		Map<String,Object> results = simpleJdbcCall.execute(params);
			
		logger.info("obtener contact - results: " + results);
			
		logger.info("message: " + (String)results.get("MESSAGE"));
			
		return (Contact) contact;  
  
	}
  
  
}
