package com.app.Controller;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.query.Param;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.app.Models.ResultSummary;
import com.app.Service.OptionService;
import com.app.Service.ResultSummaryService;

@RestController
@CrossOrigin("*")
@RequestMapping("/result")
public class ResultSummaryController {
	
	@Autowired
	public ResultSummaryService resultSummaryService;

	@Autowired
	public OptionService optionService;
	@GetMapping("/{resId}/{opId}")
	public ResponseEntity<?> getResultSummary(@PathVariable Map<String, String> pathVariables)
	{
		 int resId = Integer.parseInt(pathVariables.get("resId"));
		  int opId = Integer.parseInt(pathVariables.get("opId"));
			System.out.print("Result Summary Get api called"+resId+" "+opId+"\n");
			ResultSummary summary = this.resultSummaryService.getSummary(resId, opId);
			System.out.println(summary);
			String option = this.optionService.getLabelById(opId);
			summary.setOptionValue(option);
		  return ResponseEntity.ok(summary);
	}
	@PostMapping("/")
	public ResponseEntity<?> addResultSummary(@RequestBody ResultSummary resultSummary)
	{
		ResultSummary addResultSummary = this.resultSummaryService.addResultSummary(resultSummary);
		return ResponseEntity.ok(addResultSummary);
	}
}
