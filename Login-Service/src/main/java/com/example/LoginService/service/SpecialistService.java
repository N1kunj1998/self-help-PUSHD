package com.example.LoginService.service;

import com.example.LoginService.dao.SpecialistRepository;
import com.example.LoginService.model.Specialist;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class SpecialistService {
    @Autowired
    private SpecialistRepository specialistRepository;

    public Specialist addDetails(Specialist specialist){
        return specialistRepository.save(specialist);
    }
}
