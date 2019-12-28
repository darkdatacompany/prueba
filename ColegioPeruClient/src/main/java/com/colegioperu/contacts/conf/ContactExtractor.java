package com.colegioperu.contacts.conf;

/** 
 * 
 * @author Lizardo Rios Villavicencio 
 */  

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.dao.DataAccessException;
import org.springframework.jdbc.core.ResultSetExtractor;

import com.colegioperu.contacts.dto.Contact;
  
public class ContactExtractor implements ResultSetExtractor<Contact> {  
  
	public Contact extractData(ResultSet resultSet) throws SQLException, DataAccessException {  
    
		Contact contact = new Contact();  
    	
		contact.setId(resultSet.getLong(1));
		contact.setLastName(resultSet.getString(2) + " " + resultSet.getString(3));
		contact.setFirstName(resultSet.getString(4));
		contact.setPhoneNumber(resultSet.getString(7));
		contact.setEmail(resultSet.getString(8));
		   
		return contact;
		
	}  
  
}  