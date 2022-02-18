package com.app.Service;

import java.util.ArrayList;

import com.app.Models.FreeTime;

public interface FreeTimeService {

	public FreeTime addFreeTime(FreeTime freeTime);
	public ArrayList<FreeTime> geFreeTimes();
	public FreeTime getFreeTime(int freeTimeId);
}
