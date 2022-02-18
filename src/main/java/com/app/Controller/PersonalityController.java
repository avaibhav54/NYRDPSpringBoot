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

import com.app.Models.Personality;
import com.app.Service.PersonalityService;

@RestController
@CrossOrigin("*")
@RequestMapping("/personality")
public class PersonalityController {

	@Autowired
	private PersonalityService personalityService;
	
	@PostMapping("/")
	public ResponseEntity<?> addPersonality(@RequestBody Personality personality)
	{
		Personality personality2=this.personalityService.addPersonality(personality);
		return ResponseEntity.ok(personality2);
	}
	
	@GetMapping("/")
	public ResponseEntity<?> getPersonalities()
	{
		return ResponseEntity.ok(this.personalityService.getPersonalities());
	}
	
	@GetMapping("/{id}")
	public Personality getPersonality(@PathVariable("id") int id)
	{
		return this.personalityService.getPersonality(id);
	}
}
