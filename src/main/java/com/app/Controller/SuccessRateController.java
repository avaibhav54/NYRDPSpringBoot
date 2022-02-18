package com.app.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.app.Models.SuccessRate;
import com.app.Service.SuccessRateService;

@RestController
@RequestMapping("success-rate")
@CrossOrigin("*")
public class SuccessRateController {

	@Autowired
	private SuccessRateService successRateService;
	
	@PostMapping("/")
	public ResponseEntity<?> addSuccessRate(@RequestBody SuccessRate successRate)
	{
		SuccessRate sRate=this.successRateService.addSuccessRate(successRate);
		return ResponseEntity.ok(sRate);
	}
	
	@GetMapping("/")
	public ResponseEntity<?> getSuccessRates()
	{
		return ResponseEntity.ok(this.successRateService.getSuccessRates());
	}
	
	@GetMapping("/{id}")
	public SuccessRate getSuccessRate(@PathVariable("id") int id)
	{
		return this.successRateService.getSuccessRate(id);
	}
	
}
