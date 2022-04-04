package com.example.LoginService.service;

import com.example.LoginService.dao.DoctorRepository;
import com.example.LoginService.model.Doctor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class DoctorService {
    @Autowired
    private DoctorRepository doctorRepository;

    public Doctor addDetails(Doctor doctor){
        return doctorRepository.save(doctor);
    }
}
