package com.example.LoginService.dao;

import com.example.LoginService.model.Quiz;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface QuizRepository extends JpaRepository<Quiz, Integer> {
    public List<Quiz> getQuizBySectionId(int id);
}
