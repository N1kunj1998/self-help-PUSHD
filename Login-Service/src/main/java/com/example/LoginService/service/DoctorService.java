package com.example.LoginService.service;

import com.example.LoginService.dao.DoctorRepository;
import com.example.LoginService.model.Doctor;
import com.example.LoginService.model.Patient;
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

    public void populate(){
        Doctor doctor1 = new Doctor(2,"pragya@gmail.com",new Date(),"pragya","khare","12");
        doctorRepository.save(doctor1);
        Doctor doctor2 = new Doctor(1,"hiiamsuchi@gmail.com",new Date(),"suchi","bhargav","18");
        doctorRepository.save(doctor2);
        Doctor doctor3 = new Doctor(1,"nikunj@gmail.com",new Date(),"nikunj","agarwal","15");
        doctorRepository.save(doctor3);
        Doctor doctor4 = new Doctor(1,"naman@gmail.com",new Date(),"naman","aggarwal","10");
        doctorRepository.save(doctor4);
    }
}
