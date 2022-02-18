package com.app.Models;

import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.SequenceGenerator;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
public class ResFamily {

	@Id
	private int id;
	private String name;
	@OneToMany(mappedBy = "family",cascade = CascadeType.ALL)
	@JsonIgnore
	private List<Resolution> resolution;

	
	
	public ResFamily() {
		super();
		// TODO Auto-generated constructor stub
	}
	public ResFamily(int id, String name, List<Resolution> resolution) {
		super();
		this.id = id;
		this.name = name;
		this.resolution = resolution;
	}
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
	public List<Resolution> getResolution() {
		return resolution;
	}
	public void setResolution(List<Resolution> resolution) {
		this.resolution = resolution;
	}
	
}
