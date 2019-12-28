package com.colegioperu.rest;
/** 
 * 
 * @author Lizardo Rios Villavicencio 
 */  

import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.colegioperu.model.ModelData;

@RestController
@RequestMapping(path = "rest/dataColegioPeru")
public class RestData {
	
	@GetMapping(path = "obtenerDatos", produces = MediaType.APPLICATION_JSON_VALUE)
	public ModelData getData(@RequestParam(name = "msg") String message) {
		ModelData response = new ModelData();
		if (message.equals("Colegio Peru")) {
			response.setCode(200);
			response.setStatus(true);
			response.setMensaje("Mensaje Success. . .");
		} else {
			response.setCode(402);
			response.setStatus(false);
			response.setMensaje("Mensaje Fallido: " + message);
		}
		return response;
	}
	
}
