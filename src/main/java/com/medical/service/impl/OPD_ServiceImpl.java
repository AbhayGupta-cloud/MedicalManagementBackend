package com.medical.service.impl;

import java.util.HashSet;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.medical.model.OPD.OPD_Schedule;
import com.medical.repository.OPD_ScheduleRepository;
import com.medical.service.OPD_ScheduleService;
@Service
public class OPD_ServiceImpl implements OPD_ScheduleService {
	@Autowired
	private OPD_ScheduleRepository opd_ScheduleRepository;
	@Override
	public OPD_Schedule addOpd_Schedule(OPD_Schedule opd) {
		// TODO Auto-generated method stub
		return this.opd_ScheduleRepository.save(opd);
	}

	@Override
	public OPD_Schedule updateOpd_Schedule(OPD_Schedule opd) {
		// TODO Auto-generated method stub
		return this.opd_ScheduleRepository.save(opd);
	}
	@Override
	public Set<OPD_Schedule> getOpd_Schedules() {
		// TODO Auto-generated method stub
		return new HashSet<>(this.opd_ScheduleRepository.findAll());
	}
	@Override
	public OPD_Schedule getOpd_Schedule(Long opdId) {
		// TODO Auto-generated method stub
		return this.opd_ScheduleRepository.findById(opdId).get();
	}

	@Override
	public void deleteOpd_Schedule(Long opdId) {
		// TODO Auto-generated method stub
		OPD_Schedule opd_Schedule=new OPD_Schedule();
		opd_Schedule.setsId(opdId);
		this.opd_ScheduleRepository.delete(opd_Schedule);
	}


}
