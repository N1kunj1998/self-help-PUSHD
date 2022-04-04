package com.example.LoginService.dao;

import com.example.LoginService.model.Doctor;
import com.example.LoginService.model.Patient;
import com.sun.javadoc.Doc;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DoctorRepository extends JpaRepository<Doctor, Integer> {
}
