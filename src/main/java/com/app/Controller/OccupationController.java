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

import com.app.Models.Occupation;
import com.app.Service.OccupationService;

@RestController
@RequestMapping("/occupation")
@CrossOrigin("*")
public class OccupationController {

	@Autowired
	private OccupationService occupationService;
	
	@PostMapping("/")
	public ResponseEntity<?> addOccupation(@RequestBody Occupation occupation )
	{
		Occupation occupation2=this.occupationService.addOccupation(occupation);
		return ResponseEntity.ok(occupation2);
				
	}
	
	@GetMapping("/")
	public ResponseEntity<?> getOccupations()
	{
		return ResponseEntity.ok(this.occupationService.getOccupations());
	}
	
	@GetMapping("/{id}")
	public Occupation getOccupation(@PathVariable("id") int id)
	{
		return this.occupationService.getOccupation(id);
	}
}
