package com.app.Repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.app.Models.ResultSummary;

public interface ResultSummaryRepository extends JpaRepository<ResultSummary, Integer> {
	
	public ResultSummary findByResIdAndOptionId(int resId,int optionId);

}
