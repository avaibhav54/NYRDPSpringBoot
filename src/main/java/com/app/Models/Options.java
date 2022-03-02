

	
	
	
package com.app.Models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.SequenceGenerator;

import com.fasterxml.jackson.annotation.JsonIgnore;
@Entity
// @SequenceGenerator(name = "option_sequence", initialValue = 1, allocationSize = 1)
public class Options {
	
	@Id
	// @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "option_sequence")
	private int id;
	private String label;
	private Integer  lvalue;
	@ManyToOne(fetch = FetchType.EAGER)
	@JsonIgnore
	private Question question;
	public Integer getId() {
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
	public Integer getLvalue() {
		return lvalue;
	}
	public void setLvalue(Integer lvalue) {
		this.lvalue = lvalue;
	}
	public Options() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Options(int id, String label, Integer lvalue, Question question) {
		super();
		this.id = id;
		this.label = label;
		this.lvalue = lvalue;
		this.question = question;
	}
	public Question getQuestion() {
		return question;
	}
	public void setQuestion(Question question) {
		this.question = question;
	}

}
