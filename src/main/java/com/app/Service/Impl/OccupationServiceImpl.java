package com.app.Service.Impl;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.app.Models.Occupation;
import com.app.Repositories.OccupationRepository;
import com.app.Service.OccupationService;


@Service
public class OccupationServiceImpl implements OccupationService{

	@Autowired
	private OccupationRepository occupationRepository;
	@Override
	public Occupation addOccupation(Occupation occupation) {
		// TODO Auto-generated method stub
		return this.occupationRepository.save(occupation);
	}

	@Override
	public ArrayList<Occupation> getOccupations() {
		// TODO Auto-generated method stub
		return new ArrayList<>(this.occupationRepository.findAll());
	}

	@Override
	public Occupation getOccupation(int occupationId) {
		// TODO Auto-generated method stub
		return this.occupationRepository.findById(occupationId).get();
	}

}
