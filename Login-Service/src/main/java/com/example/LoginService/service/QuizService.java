package com.example.LoginService.service;

import com.example.LoginService.dao.QuizRepository;
import com.example.LoginService.dao.TimestampRepo;
import com.example.LoginService.model.Quiz;
import com.example.LoginService.model.Timestamp;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class QuizService {
    @Autowired
    private QuizRepository quizRepository;

    @Autowired
    private TimestampRepo timestampRepo;

    public Quiz addQuiz(Quiz quiz){
        int uid = quiz.getPatient();
        List<Timestamp> timestampList = timestampRepo.getTimestampByUid(uid);
        Timestamp ts = timestampList.get(timestampList.size() - 1);
        ts.setUsefulSession(true);
        timestampRepo.save(ts);
        return quizRepository.save(quiz);
    }

    public List<Quiz> getBySectionId(int secId) {
        return quizRepository.getQuizBySectionId(secId);
    }
}
