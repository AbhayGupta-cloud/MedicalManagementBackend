package com.medical.controller;

import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.medical.model.OPD.Doctor;
import com.medical.model.OPD.OPD_Schedule;
import com.medical.service.DoctorService;

@RestController
@CrossOrigin("*")
@RequestMapping("/doctor")
public class DoctorController {
	@Autowired
	private DoctorService doctorService;
	//add doctor
	@PostMapping("/")
	public ResponseEntity<Doctor> add(@RequestBody Doctor doctor){
		return ResponseEntity.ok(this.doctorService.addDoctor(doctor));
	}
	//update doctor details
	@PutMapping("/")
	public ResponseEntity<Doctor> update(@RequestBody Doctor doctor){
		return ResponseEntity.ok(this.doctorService.updateDoctor(doctor));
	}
	//get all doctors of any department
	@GetMapping("/doctor/{dId}")
	public ResponseEntity<?> getDoctorsByOPD(@PathVariable("dId")Long dId){
		OPD_Schedule opd_Schedule=new OPD_Schedule();
		opd_Schedule.setsId(dId);
		Set<Doctor> getdoctorsbyOPD=this.doctorService.getDoctorsByOPD(opd_Schedule);
		return ResponseEntity.ok(getdoctorsbyOPD);
	}
	
}
