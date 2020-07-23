package com.myC.thymeleaf.entity;

import javax.persistence.Table;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
@Table(name = "contact")
public class contact {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)

	@Column(name = "name", nullable = false)
	private String name;

	@Column(name = "phonenumber", nullable = false)
	private String phonenumber;

	public contact() {
	}

	public contact(String name, String phonenumber) {
		super();
		this.name = name;
		this.phonenumber = phonenumber;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPhonenumber() {
		return phonenumber;
	}

	public void setPhonenumber(String phonenumber) {
		this.phonenumber = phonenumber;
	}

	
}