package com.app.Models;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
@Entity
public class Options {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;
	private String label;
	private String value;
	
	@ManyToOne(fetch = FetchType.EAGER)
	private Question question;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getLabel() {
		return label;
	}

	public void setLabel(String label) {
		this.label = label;
	}

	public String getValue() {
		return value;
	}

	public void setValue(String value) {
		this.value = value;
	}

	public Question getQuestion() {
		return question;
	}

	public void setQuestion(Question question) {
		this.question = question;
	}

	public Options(int id, String label, String value, Question question) {
		super();
		this.id = id;
		this.label = label;
		this.value = value;
		this.question = question;
	}

}
