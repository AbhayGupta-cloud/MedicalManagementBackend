package com.medical.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.medical.model.OPD.OPD_Schedule;

public interface OPD_ScheduleRepository extends JpaRepository<OPD_Schedule,Long> {

}
