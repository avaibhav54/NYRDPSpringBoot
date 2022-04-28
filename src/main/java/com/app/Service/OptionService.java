package com.app.Service;

import java.util.ArrayList;

import com.app.Models.Options;
import com.app.Models.Question;

public interface OptionService {
	
	public Options addOptions(Options options);
	public ArrayList<Options> getOptions();
	public ArrayList<Options> getOptionByQuestion(Question ques);
	public String getLabelById(int id);
}
