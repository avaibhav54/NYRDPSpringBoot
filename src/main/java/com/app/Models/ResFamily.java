package com.app.Models;

import java.util.ArrayList;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class ResFamily {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;
	private String familyname;
	@OneToMany(mappedBy = "family",cascade = CascadeType.ALL)
	private ArrayList<Resolution> resolution;

}
