package com.colegioperu.calification.dto;

import java.io.Serializable;
import java.math.BigDecimal;

public class Calification implements Serializable {

	
	private static final long serialVersionUID = 1963209885916445300L;
	
	private Long idCalification;
	private Long idStudent;
	private Long idMateria;
	private BigDecimal average;
	private String observation;
	
	public Calification() {
		
	}

	public Calification(Long idCalification, Long idStudent, Long idMateria, BigDecimal average, String observation) {
		super();
		this.idCalification = idCalification;
		this.idStudent = idStudent;
		this.idMateria = idMateria;
		this.average = average;
		this.observation = observation;
	}

	public Long getIdCalification() {
		return idCalification;
	}
	public void setIdCalification(Long idCalification) {
		this.idCalification = idCalification;
	}

	public Long getIdStudent() {
		return idStudent;
	}
	public void setIdStudent(Long idStudent) {
		this.idStudent = idStudent;
	}

	public Long getIdMateria() {
		return idMateria;
	}
	public void setIdMateria(Long idMateria) {
		this.idMateria = idMateria;
	}

	public BigDecimal getAverage() {
		return average;
	}
	public void setAverage(BigDecimal average) {
		this.average = average;
	}

	public String getObservation() {
		return observation;
	}
	public void setObservation(String observation) {
		this.observation = observation;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Calification [idCalification=");
		builder.append(idCalification);
		builder.append(", idStudent=");
		builder.append(idStudent);
		builder.append(", idMateria=");
		builder.append(idMateria);
		builder.append(", average=");
		builder.append(average);
		builder.append(", observation=");
		builder.append(observation);
		builder.append("]");
		
		return builder.toString();
	}
	
	

}
