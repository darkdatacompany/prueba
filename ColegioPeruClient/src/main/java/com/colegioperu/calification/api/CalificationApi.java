package com.colegioperu.calification.api;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.colegioperu.calification.dto.Calification;
import com.colegioperu.calification.service.CalificationService;

/** 
 * 
 * @author Lizardo Rios Villavicencio 
 */  

@RestController
public class CalificationApi {
	
	@Autowired
	CalificationService calificationService;
	
	@RequestMapping(value = "/getCalification", method = RequestMethod.POST)
	public Calification getCalification(Long idCalification) {
		return calificationService.getCalification(idCalification);
	}

}
