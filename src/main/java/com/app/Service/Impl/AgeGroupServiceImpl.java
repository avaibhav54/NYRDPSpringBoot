package com.app.Service.Impl;

import java.util.ArrayList;

import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.app.Models.AgeGroup;
import com.app.Repositories.AgeGroupRepository;
import com.app.Service.AgeGroupService;

@Service
public class AgeGroupServiceImpl implements AgeGroupService {
	
	@Autowired
	private AgeGroupRepository ageGroupRepository;

	@Override
	public AgeGroup addAgeGroup(AgeGroup group) {
		// TODO Auto-generated method stub
		return this.ageGroupRepository.save(group);
	}

	@Override
	public ArrayList<AgeGroup> getAgeGroups() {
		// TODO Auto-generated method stub
		return new ArrayList<>(this.ageGroupRepository.findAll());
	}
	@Override
	public AgeGroup getAgeGroup(int ageGroupId) {
		// TODO Auto-generated method stub
		return this.ageGroupRepository.findById(ageGroupId).get();
	}

}
