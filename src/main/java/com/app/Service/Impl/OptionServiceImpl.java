package com.app.Service.Impl;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.app.Models.Options;
import com.app.Models.Question;
import com.app.Repositories.OptionRepository;
import com.app.Service.OptionService;

@Service
public class OptionServiceImpl implements OptionService {
	
	@Autowired
	private OptionRepository optionRepository;

	@Override
	public Options addOptions(Options options) {
		// TODO Auto-generated method stub
		return this.optionRepository.save(options);
	}

	@Override
	public ArrayList<Options> getOptions() {
		// TODO Auto-generated method stub
		return new ArrayList<>(this.optionRepository.findAll());
	}

	@Override
	public ArrayList<Options> getOptionByQuestion(Question ques) {
		// TODO Auto-generated method stub
		return new ArrayList<>(this.optionRepository.findByQuestion(ques));
	}

}
