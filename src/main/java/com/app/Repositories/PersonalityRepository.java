package com.app.Repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.app.Models.Personality;

public interface PersonalityRepository extends JpaRepository<Personality, Integer> {

}
