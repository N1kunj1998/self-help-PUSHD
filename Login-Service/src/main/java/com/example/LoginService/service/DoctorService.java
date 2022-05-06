package com.example.LoginService.service;

import com.example.LoginService.dao.DoctorRepository;
import com.example.LoginService.model.Doctor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;

@Service
public class DoctorService {
    @Autowired
    private DoctorRepository doctorRepository;

    public Doctor addDetails(Doctor doctor){
        doctor.setDateOfBirth(new Date());
        return doctorRepository.save(doctor);
    }
}
