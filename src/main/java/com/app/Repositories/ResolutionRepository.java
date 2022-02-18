package com.app.Repositories;

import java.util.ArrayList;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.app.Models.ResFamily;
import com.app.Models.Resolution;

public interface ResolutionRepository extends JpaRepository<Resolution, Integer>{

	List<Resolution> findByFamily(ResFamily family);

}
