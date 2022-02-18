package com.app.Models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class SuccessRate {

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

	public String getGap() {
		return gap;
	}

	public void setGap(String gap) {
		this.gap = gap;
	}

	public SuccessRate(int id, String gap) {
		super();
		this.id = id;
		this.gap = gap;
	}

	public SuccessRate() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
}
