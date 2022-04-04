package com.example.LoginService.dao;

import com.example.LoginService.model.Patient;
import com.example.LoginService.model.Specialist;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SpecialistRepository extends JpaRepository<Specialist, Integer> {
}
