package com.app.Service;

import java.util.ArrayList;

import com.app.Models.Personality;

public interface PersonalityService {

	public Personality addPersonality(Personality personality);
	public ArrayList<Personality> getPersonalities();
	public Personality getPersonality(int personalityId);
}
