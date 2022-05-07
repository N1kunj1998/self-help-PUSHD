package com.example.LoginService.service;

import com.example.LoginService.dao.QuizResponseRepo;
import com.example.LoginService.model.QResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class QuizResponseService {
    @Autowired
    private QuizResponseRepo quizResponseRepo;

    public QResponse addResponse(QResponse qResponse){
        return quizResponseRepo.save(qResponse);
    }

    public QResponse getResponse(String key, int userid){
        return quizResponseRepo.findByKeyAndUserId(key, userid);
    }
}
