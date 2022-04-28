package com.app.Service.Impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.app.Models.ResultSummary;
import com.app.Repositories.ResultSummaryRepository;
import com.app.Service.ResultSummaryService;

@Service
public class ResultSummaryServiceImpl implements ResultSummaryService{

	@Autowired
	public ResultSummaryRepository resultSummaryRepository;
	
	@Override
	public ResultSummary getSummary(int resolutionId, int optionId) {
		// TODO Auto-generated method stub
		
		return this.resultSummaryRepository.findByResIdAndOptionId(resolutionId, optionId);
	}

	@Override
	public ResultSummary addResultSummary(ResultSummary resultSummary) {
		// TODO Auto-generated method stub
		return this.resultSummaryRepository.save(resultSummary);
	}

}
