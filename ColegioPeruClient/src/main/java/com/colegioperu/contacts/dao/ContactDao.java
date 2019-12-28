package com.colegioperu.contacts.dao;
/** 
 * 
 * @author Lizardo Rios Villavicencio 
 */  

import java.util.List;
import java.util.Optional;

//import javax.sql.DataSource;

import com.colegioperu.contacts.dto.Contact;

public interface ContactDao {
	
	public Contact saveAndFlush(Contact contact);
	
	public Optional<Contact> findById(Long id);
	
	public Contact getContact(Long id);
	
	public List<Contact> listContacts();
	
}
