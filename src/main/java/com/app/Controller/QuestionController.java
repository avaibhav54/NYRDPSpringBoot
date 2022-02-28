package com.app.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.app.Models.Question;
import com.app.Service.QuestionService;

@RestController
@CrossOrigin("*")
@RequestMapping("/question")
public class QuestionController {

	@Autowired
	private QuestionService questionService;
	
	@PostMapping("/")
	public ResponseEntity<?> addQuestion(@RequestBody Question question)
	{
		Question question2=this.questionService.addQuestion(question);
		return ResponseEntity.ok(question2);
				
	}
	@GetMapping("/")
	public ResponseEntity<?> getQuestions()
	{
		return ResponseEntity.ok(this.questionService.getQuestions());
	}
	
	
}
