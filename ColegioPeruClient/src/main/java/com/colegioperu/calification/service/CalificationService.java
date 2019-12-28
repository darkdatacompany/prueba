package com.colegioperu.calification.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.colegioperu.calification.dao.CalificationDao;
import com.colegioperu.calification.dto.Calification;

/** 
 * 
 * @author Lizardo Rios Villavicencio 
 */  

@Service
public class CalificationService {

	@Autowired
	CalificationDao dao;
	
	public Calification getCalification(Long idCalification) {
		return dao.getCalification(idCalification);
	}
	
}
