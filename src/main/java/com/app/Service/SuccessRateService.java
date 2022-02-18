package com.app.Service;

import java.util.ArrayList;

import com.app.Models.SuccessRate;

public interface SuccessRateService {

	public SuccessRate addSuccessRate(SuccessRate successRate);
	public ArrayList<SuccessRate> getSuccessRates();
	public SuccessRate getSuccessRate(int id);
}
