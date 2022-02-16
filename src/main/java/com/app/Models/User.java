package com.app.Models;

import java.util.*;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;

@Entity
public class User {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;
	private String name;
	private int ageGroupId;
	private String gender;
	//@ManyToOne(fetch = FetchType.EAGER)
	private int  personalityId;//(0-15)
	private String sleepHabit;//(early Bird , Night owl)
	private String spendWeekend;//(stay indoor, Travelling, Go out shopping)
	private String modeOfPayment;//(credit , Debit/cash)
	private boolean exerciseRegularly;
	private int occupationId;
	private int freeTimeId;
	@OneToMany(mappedBy = "user",cascade = CascadeType.ALL)
	private List<ResHistory> history;
	
	
}
