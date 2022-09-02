package com.example.demo.model;

import java.util.List;

import javax.persistence.Access;
import javax.persistence.AccessType;
import javax.persistence.Column;
import javax.persistence.ElementCollection;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.Table;

import org.hibernate.annotations.DiscriminatorFormula;

import lombok.Data;

@Data
@Entity
@Table(name="userdets")
//@Inheritance(strategy = InheritanceType.SINGLE_TABLE)
@DiscriminatorFormula(value = "type")
public class Healthmodel {
	
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO )
	@Column(name= "id")
	private Integer id;
	
	@Column(name= "name")
	private String name;
	
	@Column(name = "phonenum")
	private String phonenum;
	
	@Column(name = "email")
	private String email;
	
	@Column(name = "address")
	private String address;
	
	@Column(name = "temperature")
	private String temperature;
	
	
	
	
	
	
	
	

	
	
	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPhonenum() {
		return phonenum;
	}

	public void setPhonenum(String phonenum) {
		this.phonenum = phonenum;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getTemperature() {
		return temperature;
	}

	public void setTemperature(String temperature) {
		this.temperature = temperature;
	}

	

	public Healthmodel(Integer id, String name, String phonenum, String email, String address, String temperature) {
		super();
		this.id = id;
		this.name = name;
		this.phonenum = phonenum;
		this.email = email;
		this.address = address;
		this.temperature = temperature;
		
	}
	
	

	
	@Override
	public String toString() {
		return "Healthmodel [id=" + id + ", name=" + name + ", phonenum=" + phonenum + ", email=" + email + ", address="
				+ address + ", temperature=" + temperature + "]";
	}

	public Healthmodel() {
		super();
	}
	
	
	
	
}
