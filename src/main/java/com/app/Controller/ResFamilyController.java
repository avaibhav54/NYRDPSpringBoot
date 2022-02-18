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
import com.app.Service.ResFamilyService;

@RestController
@CrossOrigin("*")
@RequestMapping("/res-family")
public class ResFamilyController {

	@Autowired
	private ResFamilyService resFamilyService;
	
	@PostMapping("/")
	public ResponseEntity<?> addResolutionFamily(@RequestBody ResFamily resFamily)
	{
		ResFamily family=this.resFamilyService.addResFamily(resFamily);
		return ResponseEntity.ok(family);
	}
	@GetMapping("/")
	public ResponseEntity<?> getResFamilies()
	{
		return ResponseEntity.ok(this.resFamilyService.geFamilies());
	}
	
	@GetMapping("/{id}")
	public ResFamily getFamily(@PathVariable("id") int id)
	{
		return this.resFamilyService.geResFamily(id);
	}
}
