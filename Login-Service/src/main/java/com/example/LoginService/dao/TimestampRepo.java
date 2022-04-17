package com.example.LoginService.dao;

import com.example.LoginService.model.Timestamp;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface TimestampRepo extends JpaRepository<Timestamp, Integer> {
    public List<Timestamp> getTimestampByUid(int uid);
}
