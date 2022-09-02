package com.example.demo.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;


public class Symptoms {

	//private  int symp_id;
	
	private String symptoms;
	
	
	public String getSymptoms() {
		return symptoms;
	}
	public void setSymptoms(String symptoms) {
		this.symptoms = symptoms;
	}
//	public int getSymp_id() {
//		return symp_id;
//	}
//	public void setSymp_id(int symp_id) {
//		this.symp_id = symp_id;
//	}
	public Symptoms(String symptoms, int symp_id) {
		super();
		this.symptoms = symptoms;
		//this.symp_id = symp_id;
	}
	public Symptoms() {
		super();
	}
	@Override
	public String toString() {
		return "Symptoms [symptoms=" + symptoms + "]";
	}
	
	

	

}
