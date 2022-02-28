package com.app.Repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.app.Models.Question;

public interface QuestionRepository extends JpaRepository<Question, Integer> {
	

}
