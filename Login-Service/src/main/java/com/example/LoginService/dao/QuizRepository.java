package com.example.LoginService.dao;
import org.springframework.data.jpa.repository.Query;
import com.example.LoginService.model.Quiz;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.ArrayList;
import java.util.List;

public interface QuizRepository extends JpaRepository<Quiz, Integer> {


    @Query("from Quiz where patient=?1")
    public List<Quiz> findById(int patient);
    @Query("Select count(sectionId ) from Quiz where patient=?1 and sectionId=?2")
    public Integer findByIdandSectionId(int userid,int sectionid);
    @Query("from Quiz where patient=?1 and sectionId =?2")
    public ArrayList<Quiz> findResponsebyIdandSectionId(int userid, int sectionid);

    public List<Quiz> findByIdAndSectionId(int id, int patient);
}
