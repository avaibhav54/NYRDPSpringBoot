package com.app.Service;

import java.util.ArrayList;

import com.app.Models.Question;

public interface QuestionService {
	public Question addQuestion(Question question);
	public ArrayList<Question> getQuestions();

}
