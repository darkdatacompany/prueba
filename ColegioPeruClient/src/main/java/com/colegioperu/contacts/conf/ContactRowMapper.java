package com.colegioperu.contacts.conf;

/** 
 * 
 * @author Lizardo Rios Villavicencio 
 */  
  
import java.sql.ResultSet;
import java.sql.SQLException;
import org.springframework.jdbc.core.RowMapper;
import com.colegioperu.contacts.dto.Contact;
  
public class ContactRowMapper implements RowMapper<Contact> {  
  
	@Override  
	public Contact mapRow(ResultSet resultSet, int line) throws SQLException {  
		
		ContactExtractor extractor = new ContactExtractor();
		
		return extractor.extractData(resultSet);
		
	}  
  
}  