package com.app.Models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Transient;

@Entity
public class ResultSummary {
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int id;
	private int resId;
	private int optionId;
	private String key;
	private double value;
	@Transient
	private String optionValue;
	public String getOptionValue() {
		return optionValue;
	}
	public void setOptionValue(String optionValue) {
		this.optionValue = optionValue;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getResId() {
		return resId;
	}
	public void setResId(int resId) {
		this.resId = resId;
	}
	public int getOptionId() {
		return optionId;
	}
	public void setOptionId(int optionId) {
		this.optionId = optionId;
	}
	public String getKey() {
		return key;
	}
	public void setKey(String key) {
		this.key = key;
	}
	public double getValue() {
		return value;
	}
	public void setValue(Double value) {
		this.value = value;
	}
	public ResultSummary(int id, int resId, int optionId, String key, Double value) {
		super();
		this.id = id;
		this.resId = resId;
		this.optionId = optionId;
		this.key = key;
		this.value = value;
	}
	public ResultSummary() {
		super();
		// TODO Auto-generated constructor stub
	}
	

}
