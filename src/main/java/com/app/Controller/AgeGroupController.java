package com.app.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.app.Models.AgeGroup;
import com.app.Service.AgeGroupService;

@RestController
@RequestMapping("/age-group")
@CrossOrigin("*")
public class AgeGroupController {
	
	@Autowired
	private AgeGroupService ageGroupService;
	
	 @PostMapping("/")
	    public ResponseEntity<?> addAgeGroup(@RequestBody AgeGroup ageGroup)
	    {
	     AgeGroup ageGroup2=this.ageGroupService.addAgeGroup(ageGroup);
	     return  ResponseEntity.ok(ageGroup2);
	    }

	    //get single ageGroup
	    @GetMapping("/{id}")
	    public AgeGroup getAgeGroup(@PathVariable("id") int ageGroupid)
	    {

	        return  this.ageGroupService.getAgeGroup(ageGroupid);
	    }

	    //get all categories
	    @GetMapping("/")
	    public ResponseEntity<?> getAgeGroups()
	    {
	        return  ResponseEntity.ok(this.ageGroupService.getAgeGroups());
	    }


}
