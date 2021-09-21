package com.patientTracker.demo.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.patientTracker.demo.Entities.Patient;

@Repository
public interface PatientRepo extends JpaRepository<Patient, Integer> {

}
