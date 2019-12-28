package com.colegioperu.contacts.service;
/** 
 * 
 * @author Lizardo Rios Villavicencio 
 */  

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.context.ApplicationContext;
//import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Service;

import com.colegioperu.contacts.dao.ContactDao;
import com.colegioperu.contacts.dto.Contact;

@Service
public class ContactService {
	
//	ApplicationContext context;
	@Autowired
	ContactDao dao;
	
	public ContactService() {
//		context = new ClassPathXmlApplicationContext("Beans.xml");
//	    dao = (ContactDao) context.getBean("contactJDBCTemplate");

	}
	
	public Contact save(Contact contact) {
		return dao.saveAndFlush(contact);
	}
	
	public Optional<Contact> get(Long idContact) {
		return dao.findById(idContact);
	}
	
	public Contact getContact(Long idContact) {	    
		return dao.getContact(idContact);
	}
	
	public List<Contact> listContacts() {
		return dao.listContacts();
	}
	
}
