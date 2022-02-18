package com.app.Service;

import java.util.ArrayList;

import com.app.Models.ResFamily;
import com.app.Models.Resolution;

public interface ResolutionService {

	public Resolution addResolution(Resolution resolution);
	public ArrayList<Resolution> geResolutions();
	public Resolution getResolution(int resId);
	public ArrayList<Resolution> getResolutionsByFamily(ResFamily family);
}
