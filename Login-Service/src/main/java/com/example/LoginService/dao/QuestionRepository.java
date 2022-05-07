package com.example.LoginService.dao;

import com.example.LoginService.model.Questions;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.ArrayList;

public interface QuestionRepository extends JpaRepository<Questions,Integer> {
    //	public List<Questions> saveAll(List<Questions> )
    @Query("from Questions where sectionId=?1")
    ArrayList<Questions> getBySection(int sectionId);
}