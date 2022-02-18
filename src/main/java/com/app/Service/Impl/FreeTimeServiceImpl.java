package com.app.Service.Impl;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.app.Models.FreeTime;
import com.app.Repositories.FreeTimeRepository;
import com.app.Service.FreeTimeService;

@Service
public class FreeTimeServiceImpl implements FreeTimeService{

	@Autowired
	private FreeTimeRepository freeTimeRepository;
	
	@Override
	public FreeTime addFreeTime(FreeTime freeTime) {
		// TODO Auto-generated method stub
		return this.freeTimeRepository.save(freeTime);
	}

	@Override
	public ArrayList<FreeTime> geFreeTimes() {
		// TODO Auto-generated method stub
		return new ArrayList<>(this.freeTimeRepository.findAll());
	}

	@Override
	public FreeTime getFreeTime(int freeTimeId) {
		// TODO Auto-generated method stub
		return this.freeTimeRepository.findById(freeTimeId).get();
	}

}
