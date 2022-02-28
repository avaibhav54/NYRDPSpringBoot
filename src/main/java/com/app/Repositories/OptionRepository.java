package com.app.Repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.app.Models.Options;

public interface OptionRepository extends JpaRepository<Options, Integer> {

	
}
