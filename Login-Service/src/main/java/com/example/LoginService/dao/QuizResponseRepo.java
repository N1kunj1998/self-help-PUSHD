package com.example.LoginService.dao;

import com.example.LoginService.model.QResponse;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface QuizResponseRepo extends JpaRepository<QResponse, Integer> {
    public QResponse findByKeyAndAndUserId(String key, int userid);
}
