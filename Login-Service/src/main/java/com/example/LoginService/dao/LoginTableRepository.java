package com.example.LoginService.dao;

import com.example.LoginService.model.LoginTable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface LoginTableRepository extends JpaRepository<LoginTable, Integer> {
    @Query("select l from LoginTable l where l.username = :username")
    LoginTable findByUsername(String username);
}
