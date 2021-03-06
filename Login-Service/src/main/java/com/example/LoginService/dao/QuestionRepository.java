package com.example.LoginService.dao;

import com.example.LoginService.model.Questions;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.ArrayList;

public interface QuestionRepository extends JpaRepository<Questions,Integer> {
    //	public List<Questions> saveAll(List<Questions> )
    @Query("from Questions where sectionId=?1")
    ArrayList<Questions> getBySection(int sectionId);
    @Query("select Content from Questions where qid=?1")
    String findByQId(int qid);
    @Query("select sectionId from Questions where qid=?1")
    Integer findSectionById(int qid);
    @Query("select subSectionId from Questions where qid=?1")
    Integer findSubSectionById(int qid);
}