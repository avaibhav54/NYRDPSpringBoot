package com.app.Models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class FreeTime {

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
	public FreeTime(int id, String gap) {
		super();
		this.id = id;
		this.gap = gap;
	}
	public FreeTime() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
}
