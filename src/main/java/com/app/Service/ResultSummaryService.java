package com.app.Service;

import com.app.Models.ResultSummary;

public interface ResultSummaryService {

	public ResultSummary getSummary(int resolutionId,int optionId);
	public ResultSummary addResultSummary(ResultSummary resultSummary);
}
