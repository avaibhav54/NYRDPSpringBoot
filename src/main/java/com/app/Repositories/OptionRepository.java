package com.app.Repositories;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.app.Models.Options;
import com.app.Models.Question;
public interface OptionRepository extends JpaRepository<Options, Integer> {

	public List<Options> findByQuestion(Question ques);
	public Optional<Options>  findById(Integer id);
}
