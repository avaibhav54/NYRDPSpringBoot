package com.app.Models;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.SequenceGenerator;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
@SequenceGenerator(name = "question_sequence", initialValue = 1, allocationSize = 1)
public class Question {
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE,generator = "question_sequence")
	private int id;
	private String name;
	@Column(name = "is_option_available")
	private int isOptionAvailable;
	private String type;
	
	@OneToMany(mappedBy = "question",cascade = CascadeType.ALL)
	@JsonIgnore
	private List<Options> options;

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

	public int getIsOptionAvailable() {
		return isOptionAvailable;
	}

	public void setIsOptionAvailable(int isOptionAvailable) {
		this.isOptionAvailable = isOptionAvailable;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public List<Options> getOptions() {
		return options;
	}

	public void setOptions(List<Options> options) {
		this.options = options;
	}

	public Question(int id, String name, int isOptionAvailable, String type, List<Options> options) {
		super();
		this.id = id;
		this.name = name;
		this.isOptionAvailable = isOptionAvailable;
		this.type = type;
		this.options = options;
	}

	public Question() {
		super();
		// TODO Auto-generated constructor stub
	}
	

}
