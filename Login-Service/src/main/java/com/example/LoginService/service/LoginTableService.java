package com.example.LoginService.service;

import com.example.LoginService.dao.LoginTableRepository;
import com.example.LoginService.dao.PatientRepository;
import com.example.LoginService.model.LoginTable;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class LoginTableService {

    @Autowired
    private BCryptPasswordEncoder passwordEncoder;

    @Autowired
    private LoginTableRepository loginTableRepository;

    @Autowired
    private PatientRepository patientRepository;

    public LoginTable saveLogin(LoginTable login){
//        LoginTable login = request.getLogin();
//        login.setActive(true);
        System.out.println(login);
        login.setActive(true);
        login.setPassword(passwordEncoder.encode(login.getPassword()));
        login = loginTableRepository.save(login);
        if(login.getRole().equals("ROLE_ADMIN") ) {

        }else if(login.getRole().equals("ROLE_PATIENT")){
//            Patient patient = request.getPatient(login.getId());
//            patientRepository.save(patient);
        }else if(login.getRole().equals("ROLE_DOCTOR")){

        }else if(login.getRole().equals("Specialist")){

        }
        return login;
    }

    public LoginTable findLoginByUsername(String username){
        return loginTableRepository.findByUsername(username);
    }

    public List<LoginTable> findAllLogin(){
        return loginTableRepository.findAll();
    }
}
