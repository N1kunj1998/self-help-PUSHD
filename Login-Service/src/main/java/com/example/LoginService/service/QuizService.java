package com.example.LoginService.service;

import com.example.LoginService.dao.QuizRepository;
import com.example.LoginService.model.Quiz;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class QuizService {
    @Autowired
    private QuizRepository quizRepository;

    public Quiz addQuiz(Quiz quiz){
        return quizRepository.save(quiz);
    }

    public List<Quiz> getBySectionId(int secId) {
        return quizRepository.getQuizBySectionId(secId);
    }
}
