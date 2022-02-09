package com.app.Models;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class Resolution {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;
	private String resolution;

	@ManyToOne(fetch = FetchType.EAGER)
	private ResFamily family;
	
}
