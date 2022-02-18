package com.app.Service.Impl;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.app.Models.SuccessRate;
import com.app.Repositories.SuccessRateRepository;
import com.app.Service.SuccessRateService;

@Service
public class SuccessRateServiceImpl implements SuccessRateService {

	
	@Autowired
	private SuccessRateRepository successRateRepository;
	
	
	@Override
	public SuccessRate addSuccessRate(SuccessRate successRate) {
		// TODO Auto-generated method stub
		return this.successRateRepository.save(successRate);
	}

	@Override
	public ArrayList<SuccessRate> getSuccessRates() {
		// TODO Auto-generated method stub
		return new ArrayList<>(this.successRateRepository.findAll());
	}

	@Override
	public SuccessRate getSuccessRate(int id) {
		// TODO Auto-generated method stub
		return this.successRateRepository.findById(id).get();
	}

}
