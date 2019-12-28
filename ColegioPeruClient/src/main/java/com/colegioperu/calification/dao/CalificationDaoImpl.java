package com.colegioperu.calification.dao;

import java.math.BigDecimal;
import java.util.Map;

import javax.sql.DataSource;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.namedparam.MapSqlParameterSource;
import org.springframework.jdbc.core.namedparam.SqlParameterSource;
import org.springframework.jdbc.core.simple.SimpleJdbcCall;
import org.springframework.stereotype.Repository;

import com.colegioperu.calification.dto.Calification;

@Repository
public class CalificationDaoImpl implements CalificationDao {
		
	protected final Log logger = LogFactory.getLog(CalificationDaoImpl.class);
	
	@Autowired
	DataSource dataSource;
	
	@Autowired
	JdbcTemplate jdbcTemplate;
	
	/* Implementacion de los metodos */
	@Override
	public Calification getCalification(Long idCalification) {
		SimpleJdbcCall jdbcCall = new SimpleJdbcCall(dataSource).withProcedureName("sp_get_row_calification");

	      SqlParameterSource in = new MapSqlParameterSource().addValue("in_id", idCalification);
	      Map<String, Object> out = jdbcCall.execute(in);

	      Calification calification = new Calification();
	      	
	      calification.setIdCalification(idCalification);
	      calification.setIdStudent((Long) ((Integer)out.get("out_idstudent")).longValue());
	      calification.setIdMateria((Long) ((Integer)out.get("out_idmateria")).longValue());
	      calification.setAverage((BigDecimal) out.get("out_average"));
	      calification.setObservation((String) out.get("out_observation"));
	      
	      logger.info(calification);
	      
	      return calification;  
	}
		
}
