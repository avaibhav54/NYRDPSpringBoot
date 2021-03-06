package com.app.Models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "age_group")
public class AgeGroup {

	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;
	private String gap;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getGroup() {
		return gap;
	}
	public void setGroup(String group) {
		this.gap = group;
	}
	public AgeGroup(int id, String group) {
		super();
		this.id = id;
		this.gap = group;
	}
	public AgeGroup() {
		super();
		// TODO Auto-generated constructor stub
	}
	
}
