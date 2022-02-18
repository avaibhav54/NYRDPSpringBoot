package com.app.Service.Impl;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.app.Models.ResFamily;
import com.app.Repositories.ResFamilyRepository;
import com.app.Service.ResFamilyService;

@Service
public class ResFamilyServiceImpl implements ResFamilyService {
	
	
	@Autowired
	private ResFamilyRepository resFamilyRepository;

	@Override
	public ResFamily addResFamily(ResFamily family) {
		// TODO Auto-generated method stub
		return this.resFamilyRepository.save(family);
	}

	@Override
	public ArrayList<ResFamily> geFamilies() {
		// TODO Auto-generated method stub
		return new ArrayList<>(this.resFamilyRepository.findAll());
	}

	@Override
	public ResFamily geResFamily(int resFamilyId) {
		// TODO Auto-generated method stub
		return this.resFamilyRepository.findById(resFamilyId).get();
	}

}
