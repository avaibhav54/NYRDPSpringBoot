package com.app.Service;

import java.util.ArrayList;

import com.app.Models.Occupation;

public interface OccupationService {

	public Occupation addOccupation(Occupation occupation);
	public ArrayList<Occupation> getOccupations();
	public Occupation getOccupation(int occupationId);
}
