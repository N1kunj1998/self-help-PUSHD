package com.example.LoginService.service;

import com.example.LoginService.dao.LoginTableRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class FetchemailService {

    @Autowired
    private LoginTableRepository loginTableRepository;

    public List<String> fetchallemail(){
        return loginTableRepository.getAllEmail();
    }
}