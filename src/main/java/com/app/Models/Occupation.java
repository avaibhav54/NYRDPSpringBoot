package com.app.Models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Occupation {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;
	private String occname;
}
