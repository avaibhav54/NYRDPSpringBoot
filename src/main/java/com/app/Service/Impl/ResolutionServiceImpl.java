package com.app.Service.Impl;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.app.Models.ResFamily;
import com.app.Models.Resolution;
import com.app.Repositories.ResolutionRepository;
import com.app.Service.ResolutionService;

@Service
public class ResolutionServiceImpl implements ResolutionService {
	
	
	@Autowired
	private ResolutionRepository resolutionRepository;

	@Override
	public Resolution addResolution(Resolution resolution) {
		// TODO Auto-generated method stub
		return this.resolutionRepository.save(resolution);
	}

	@Override
	public ArrayList<Resolution> geResolutions() {
		// TODO Auto-generated method stub
		return new ArrayList<>(this.resolutionRepository.findAll());
	}

	@Override
	public Resolution getResolution(int resId) {
		// TODO Auto-generated method stub
		return this.resolutionRepository.findById(resId).get();
	}

	@Override
	public ArrayList<Resolution> getResolutionsByFamily(ResFamily family) {
		// TODO Auto-generated method stub
		return (ArrayList<Resolution>) this.resolutionRepository.findByFamily(family);
				
	}

}
