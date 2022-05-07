package com.example.LoginService.dao;

import com.example.LoginService.model.Patient;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface PatientRepository extends JpaRepository<Patient, Integer> {
    public List<Patient> getPatientsByDocId(int docId);
}
