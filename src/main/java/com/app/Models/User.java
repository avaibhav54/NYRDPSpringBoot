package com.app.Models;

import java.util.*;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@SequenceGenerator(name = "user_sequence", initialValue = 1024, allocationSize = 1)
@Table(name = "users")
public class User {

	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE,generator = "user_sequence")
	private int id;
	private String name;
	@Column(name = "age_group_id")
	private int ageGroupId;
	private String gender;
	@Column(name = "personality_id")
	private int  personalityId;//(1-16)
	@Column(name = "sleep_habit")
	private String sleepHabit;//(early Bird , Night owl)
	@Column(name = "spend_weekend")
	private String spendWeekend;//(stay indoor, Travelling, Go out shopping)
	@Column(name = "mode_of_payment")
	private String modeOfPayment;//(credit , Debit/cash)
	@Column(name = "exercise_regularly")
	private boolean exerciseRegularly;
	@Column(name = "occupation_id")
	private int occupationId;
	@Column(name = "free_time_id")
	private int freeTimeId;
	@OneToMany(mappedBy = "user",cascade = CascadeType.ALL)
	private List<ResHistory> history;
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
	public int getAgeGroupId() {
		return ageGroupId;
	}
	public void setAgeGroupId(int ageGroupId) {
		this.ageGroupId = ageGroupId;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public int getPersonalityId() {
		return personalityId;
	}
	public void setPersonalityId(int personalityId) {
		this.personalityId = personalityId;
	}
	public String getSleepHabit() {
		return sleepHabit;
	}
	public void setSleepHabit(String sleepHabit) {
		this.sleepHabit = sleepHabit;
	}
	public String getSpendWeekend() {
		return spendWeekend;
	}
	public void setSpendWeekend(String spendWeekend) {
		this.spendWeekend = spendWeekend;
	}
	public String getModeOfPayment() {
		return modeOfPayment;
	}
	public void setModeOfPayment(String modeOfPayment) {
		this.modeOfPayment = modeOfPayment;
	}
	public boolean isExerciseRegularly() {
		return exerciseRegularly;
	}
	public void setExerciseRegularly(boolean exerciseRegularly) {
		this.exerciseRegularly = exerciseRegularly;
	}
	public int getOccupationId() {
		return occupationId;
	}
	public void setOccupationId(int occupationId) {
		this.occupationId = occupationId;
	}
	public int getFreeTimeId() {
		return freeTimeId;
	}
	public void setFreeTimeId(int freeTimeId) {
		this.freeTimeId = freeTimeId;
	}
	public List<ResHistory> getHistory() {
		return history;
	}
	public void setHistory(List<ResHistory> history) {
		this.history = history;
	}
	public User(int id, String name, int ageGroupId, String gender, int personalityId, String sleepHabit,
			String spendWeekend, String modeOfPayment, boolean exerciseRegularly, int occupationId, int freeTimeId,
			List<ResHistory> history) {
		super();
		this.id = id;
		this.name = name;
		this.ageGroupId = ageGroupId;
		this.gender = gender;
		this.personalityId = personalityId;
		this.sleepHabit = sleepHabit;
		this.spendWeekend = spendWeekend;
		this.modeOfPayment = modeOfPayment;
		this.exerciseRegularly = exerciseRegularly;
		this.occupationId = occupationId;
		this.freeTimeId = freeTimeId;
		this.history = history;
	}
	public User() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
}
