package com.app.Service.Impl;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.app.Models.Question;
import com.app.Repositories.QuestionRepository;
import com.app.Service.QuestionService;

@Service
public class QuestionServiceImpl implements QuestionService {

	
	@Autowired
	private QuestionRepository questionRepository;
	
	@Override
	public Question addQuestion(Question question) {
		// TODO Auto-generated method stub
		return this.questionRepository.save(question);
	}

	@Override
	public ArrayList<Question> getQuestions() {
		// TODO Auto-generated method stub
		return new ArrayList<>(this.questionRepository.findAll());
	}

	
}
