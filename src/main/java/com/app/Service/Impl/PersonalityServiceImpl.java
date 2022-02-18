package com.app.Service.Impl;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.app.Models.Personality;
import com.app.Repositories.PersonalityRepository;
import com.app.Service.PersonalityService;


@Service
public class PersonalityServiceImpl implements PersonalityService{
	
	@Autowired
	private PersonalityRepository personalityRepository;

	@Override
	public Personality addPersonality(Personality personality) {
		// TODO Auto-generated method stub
		return this.personalityRepository.save(personality);
	}

	@Override
	public ArrayList<Personality> getPersonalities() {
		// TODO Auto-generated method stub
		return new ArrayList<>(this.personalityRepository.findAll());
	}

	@Override
	public Personality getPersonality(int personalityId) {
		// TODO Auto-generated method stub
		return this.personalityRepository.findById(personalityId).get();
	}

}
