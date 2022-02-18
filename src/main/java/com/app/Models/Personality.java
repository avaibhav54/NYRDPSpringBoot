package com.app.Models;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.SequenceGenerator;
@Entity
@SequenceGenerator(name = "personality_sequence", initialValue = 1, allocationSize = 1)
public class Personality {

	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE,generator = "personality_sequence")
	private int id;
	
	private String name;

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

	public Personality(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}

	public Personality() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	
	
}
