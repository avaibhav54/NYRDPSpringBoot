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

import com.app.Models.ResFamily;
import com.app.Models.Resolution;
import com.app.Service.ResFamilyService;
import com.app.Service.ResolutionService;

@RestController
@CrossOrigin("*")
@RequestMapping("/resolution")
public class ResolutionController {

	@Autowired
	private ResolutionService resolutionService;
	
	@Autowired
	private ResFamilyService resFamilyService;
	
	@PostMapping("/")
	public ResponseEntity<?> addResolution(@RequestBody Resolution resolution)
	{
		Resolution res =this.resolutionService.addResolution(resolution);
		return ResponseEntity.ok(res);
		
	}
	
	@GetMapping("/")
	public ResponseEntity<?> getResolutions()
	{
		return ResponseEntity.ok(this.resolutionService.geResolutions());
	}
	
	@GetMapping("/{id}")
	public Resolution getResolution(@PathVariable("id") int id)
	{
		return this.resolutionService.getResolution(id);
	}
	
	@GetMapping("/family/{id}")
	public ResponseEntity<?> getResolutionByFamily(@PathVariable("id") int id)
	{

		ResFamily family=this.resFamilyService.geResFamily(id);
		
		
		return ResponseEntity.ok(this.resolutionService.getResolutionsByFamily(family));
	}
	
}
