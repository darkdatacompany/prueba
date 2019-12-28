package com.colegioperu.contacts.api;
/** 
 * 
 * @author Lizardo Rios Villavicencio 
 */  

import java.util.List;
import java.util.Optional;

import javax.validation.Valid;

import org.dozer.Mapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.colegioperu.contacts.dto.Contact;
import com.colegioperu.contacts.service.ContactService;

@RestController
public class ContactsApi {
	
	@Autowired
	ContactService contactService;
	
	// Inyecta mapper de Dozer
	@Autowired
	Mapper mapper;
	
	@RequestMapping(value = "/product", method = RequestMethod.GET)
	public Contact getByProduct() {	
		return new Contact(1L, "John", "Doe", "+57 311 222 3344", "john@sinbugs.com");
	}
	
	@RequestMapping(value = "/contact", method = RequestMethod.POST)
	public ContactResponse updateOrSave(@RequestBody @Valid ContactRequest contactRequest) {
		// Mapeo request dto ==> entity
		Contact contact = mapper.map(contactRequest, Contact.class);
		
		// Invoca logica de negocio
		Contact updateContact = contactService.save(contact);
		
		// Mapeo entity ==> response dto
		ContactResponse contactResponse = mapper.map(updateContact, ContactResponse.class);
		
		return contactResponse;
	}
	
	@RequestMapping(value = "/getContact", method = RequestMethod.POST)
	public Optional<Contact> getContact(Long idContact) {
		// Invoca logica de negocio
		Optional<Contact> contact = contactService.get(idContact);
		System.out.println("contact: " + contact);
		
		return contact;
	}
	
	@RequestMapping(value = "/getRowContact", method = RequestMethod.POST)
	public Contact getRowContact(Long idContact) {
		// Invoca logica de negocio
		Contact contact = contactService.getContact(idContact);
		System.out.println("Contact Row: " + contact);
		
		return contact;
	}
	
	@RequestMapping(value = "/listContacts", method = RequestMethod.POST)
	public List<Contact> listContacts() {
		// Invoca logica de negocio
		return contactService.listContacts();
	}
	
	@RequestMapping(value = "/contact", method = RequestMethod.GET)
	public Contact getById() {	
		return new Contact(1L, "John", "Doe", "+57 311 222 3344", "john@sinbugs.com");
	}

}
