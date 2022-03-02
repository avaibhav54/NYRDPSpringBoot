package com.app.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.app.Models.Options;
import com.app.Service.OptionService;

@RestController
@CrossOrigin("*")
@RequestMapping("/option")
public class OptionController {

	
	@Autowired
	private OptionService optionService;
	
	@GetMapping("/")
	public ResponseEntity<?> getOptions()
	{

		return ResponseEntity.ok(this.optionService.getOptions());
	}
	
	@PostMapping("/")
	public ResponseEntity<?> addOptions(@RequestBody Options  options)
	{
		System.out.println("Checking");
		System.out.print(options);
		return ResponseEntity.ok(this.optionService.addOptions(options));
	}
	
	
	
}
