package com.app.Models;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.SequenceGenerator;

@Entity
@SequenceGenerator(name = "res_sequence",initialValue = 1,allocationSize = 1)
public class Resolution {

	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE,generator = "res_sequence")
	private int id;
	private String name;

	@ManyToOne(fetch = FetchType.EAGER)
	private ResFamily family;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public ResFamily getFamily() {
		return family;
	}

	public void setFamily(ResFamily family) {
		this.family = family;
	}

	public Resolution(int id, String name, ResFamily family) {
		super();
		this.id = id;
		this.name = name;
		this.family = family;
	}

	public Resolution() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
}
