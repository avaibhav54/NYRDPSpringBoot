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

import com.app.Models.FreeTime;
import com.app.Service.FreeTimeService;

@RestController
@RequestMapping("/free-time")
@CrossOrigin("*")
public class FreeTimeController {

	@Autowired
	private FreeTimeService freeTimeService;
	
	@PostMapping("/")
	public ResponseEntity<?> addFreeTime(@RequestBody FreeTime freeTime)
	{
		FreeTime  fTime=this.freeTimeService.addFreeTime(freeTime);
		return ResponseEntity.ok(fTime);
	}
	@GetMapping("/")
	public ResponseEntity<?> getFreeTimes()
	{
		return ResponseEntity.ok(this.freeTimeService.geFreeTimes());
	}
	
	@GetMapping("/{id}")
	public FreeTime getFreeTime(@PathVariable("id") int id)
	{
		return this.freeTimeService.getFreeTime(id);
		
	}
}
