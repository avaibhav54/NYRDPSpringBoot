package com.app.Models;

import java.util.*;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;

@Entity
public class User {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;
	private String name;
	private int age;
	private String gender;
	@OneToOne
	private Personality personality;
	private String sleepHabit;
	private String spendWeekend;
	private String modeOfPayment;
	private boolean exerciseRegularly;
	private String occupation;
	@OneToMany(mappedBy = "user",cascade = CascadeType.ALL)
	private List<ResHistory> historyHistories=new ArrayList();
	
	
}
