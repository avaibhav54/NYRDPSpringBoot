package com.app.Service;

import java.util.ArrayList;
import java.util.Set;

import com.app.Models.AgeGroup;

public interface AgeGroupService {

	public AgeGroup addAgeGroup(AgeGroup group);
	public ArrayList<AgeGroup> getAgeGroups();
	public AgeGroup getAgeGroup(int ageGroupId);
}
