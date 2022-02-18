package com.app.Repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.app.Models.Occupation;

public interface OccupationRepository extends JpaRepository<Occupation, Integer> {

}
