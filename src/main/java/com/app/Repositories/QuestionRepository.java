package com.app.Repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.app.Models.Options;
import com.app.Models.Question;

public interface QuestionRepository extends JpaRepository<Question, Integer> {
	
	
}
