package com.medical.service;

import java.util.Set;

import com.medical.model.OPD.Doctor;
import com.medical.model.OPD.OPD_Schedule;

public interface DoctorService {
	public Doctor addDoctor(Doctor doctor);
	public Doctor updateDoctor(Doctor doctor);
	public Set<Doctor> getDoctors();
	public Doctor getDoctor(Long dId);
	public Set<Doctor> getDoctorsByOPD(OPD_Schedule opd);
}
