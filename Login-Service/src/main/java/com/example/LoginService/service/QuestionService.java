package com.example.LoginService.service;

import com.example.LoginService.dao.QuestionRepository;
import com.example.LoginService.model.Questions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Configurable;
import org.springframework.stereotype.Service;

import java.util.ArrayList;

@Service
@Configurable
public class QuestionService {
    @Autowired
    private static QuestionRepository quesRepository;
    public  ArrayList<Questions> getAll()
    {
        ArrayList<Questions> ques=(ArrayList<Questions>)quesRepository.findAll();
        return ques;
    }

}
