package com.medical.repository;

import java.util.Set;

import org.springframework.data.jpa.repository.JpaRepository;

import com.medical.model.OPD.Doctor;
import com.medical.model.OPD.OPD_Schedule;

public interface DoctorRepository extends JpaRepository<Doctor,Long> {

	//Set<Doctor> findByOPD(OPD_Schedule opd);

}
