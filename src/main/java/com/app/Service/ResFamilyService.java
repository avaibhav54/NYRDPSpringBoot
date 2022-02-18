package com.app.Service;

import java.util.ArrayList;

import com.app.Models.ResFamily;

public interface ResFamilyService {

	public ResFamily addResFamily(ResFamily family);
	public ArrayList<ResFamily> geFamilies();
	public ResFamily geResFamily(int resFamilyId);
}
