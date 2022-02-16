package com.app.Models;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
@Entity
public class Personality {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;
	private String type;

	//@OneToMany(mappedBy = "personality", cascade = CascadeType.ALL)
	//private User user;
	
	//@OneToOne(mappedBy = "personality")
	//private ResHistory history;
	
	
}
