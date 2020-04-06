package com.mindtree.kalingahospital.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class KalingaHospital {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int patientId;
	private String patientName;
	public KalingaHospital() {
		super();
		// TODO Auto-generated constructor stub
	}
	public int getPatientId() {
		return patientId;
	}
	public void setPatientId(int patientId) {
		this.patientId = patientId;
	}
	public String getPatientName() {
		return patientName;
	}
	public void setPatientName(String patientName) {
		this.patientName = patientName;
	}
	
	

}
