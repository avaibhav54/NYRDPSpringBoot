package com.app.Models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
@Entity
public class ResHistory {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;
	
	@Column(name = "resolution_id")
	private int resolutionId;
	
	@Column(name = "success_rate_id")
	private int successRateId;
	
	@ManyToOne(fetch = FetchType.EAGER)
	private User user;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getResolutionId() {
		return resolutionId;
	}

	public void setResolutionId(int resolutionId) {
		this.resolutionId = resolutionId;
	}

	public int getSuccessRateId() {
		return successRateId;
	}

	public void setSuccessRateId(int successRateId) {
		this.successRateId = successRateId;
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	public ResHistory(int id, int resolutionId, int successRateId, User user) {
		super();
		this.id = id;
		this.resolutionId = resolutionId;
		this.successRateId = successRateId;
		this.user = user;
	}

	public ResHistory() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	
	
	
}
