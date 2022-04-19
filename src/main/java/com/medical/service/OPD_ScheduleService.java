package com.medical.service;

import java.util.Set;

import com.medical.model.OPD.OPD_Schedule;

public interface OPD_ScheduleService {
	public OPD_Schedule addOpd_Schedule(OPD_Schedule opd);
	public OPD_Schedule updateOpd_Schedule(OPD_Schedule opd);
	public Set<OPD_Schedule>getOpd_Schedules();
	public OPD_Schedule getOpd_Schedule(Long opdId);
	public void deleteOpd_Schedule(Long opdId);
	
}
