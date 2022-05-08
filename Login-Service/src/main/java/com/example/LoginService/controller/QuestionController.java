package com.example.LoginService.controller;

import com.example.LoginService.dao.QuestionRepository;
import com.example.LoginService.model.Questions;
import com.example.LoginService.service.QuestionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.annotation.PostConstruct;
import java.util.ArrayList;

@CrossOrigin("*")
@RestController
@EnableAutoConfiguration
@RequestMapping(value="/api")
public class QuestionController {
    @Autowired
    private QuestionRepository ques;
    @Autowired
    private QuestionService quesService;
    ArrayList<Questions> questionList;
    @PostConstruct
    @RequestMapping("/add")
    public void add()
    {
        questionList = new ArrayList<Questions>();

        Questions q1=new Questions(1,1,2,"F","Are you likely to face some difficulties in implemneting your plan?,List them out","","","","");
        Questions q2=new Questions(2,1,2,"F","List out your strategy that you can use to manage difficulties","","","","");
        Questions q3=new Questions(3,1,3,"F","Do you feel lonely always","","","","");
        Questions q4=new Questions(4,1,1,"M","How you feel happy","Dancing","Music","Novels","Web Series");
        Questions q5=new Questions(5,1,3,"F","Do you go outside for weeknds","","","","");
        Questions q6=new Questions(6,1,1,"M","What do you want to be?","Dancer","Musician","Novelist","Other");
        Questions q7=new Questions(7,2,1,"F","List out your strategy that you can use to manage difficulties","","","","");
        Questions q8=new Questions(8,2,1,"F","Do you go outside for weeknds","","","","");
        Questions q9=new Questions(9,2,2,"F","How do you spend your time","","","","");
        Questions q10=new Questions(10,2,2,"F","Are you likely to face some difficulties in implemneting your plan?,List them out","","","","");
        Questions q11=new Questions(11,2,3,"F","List out your strategy that you can use to manage difficulties","","","","");
        Questions q12=new Questions(12,2,3,"F","Do you feel lonely always","","","","");
        Questions q13=new Questions(13,3,1,"M","How you feel happy","Dancing","Music","Novels","Web Series");
        Questions q14=new Questions(14,3,1,"F","Do you go outside for weeknds","","","","");
        Questions q15=new Questions(15,3,2,"M","How you feel happy","Dancing","Music","Novels","Web Series");
        Questions q16=new Questions(16,3,2,"F","List out your strategy that you can use to manage difficulties","","","","");
        Questions q17=new Questions(17,3,3,"F","Do you go outside for weeknds","","","","");
        Questions q18=new Questions(18,3,3,"F","How do you spend your time","","","","");
        Questions q19=new Questions(19,4,1,"F","List out your strategy that you can use to manage difficulties","","","","");
        Questions q20=new Questions(20,4,1,"F","Do you feel lonely always","","","","");
        Questions q21=new Questions(21,4,2,"M","How you feel happy","Dancing","Music","Novels","Web Series");
        Questions q22=new Questions(22,4,2,"F","Do you go outside for weeknds","","","","");
        Questions q23=new Questions(23,4,3,"M","How you feel happy","Dancing","Music","Novels","Web Series");
        Questions q24=new Questions(24,4,3,"F","List out your strategy that you can use to manage difficulties","","","","");
        Questions q25=new Questions(25,5,1,"F","Do you go outside for weeknds","","","","");
        Questions q26=new Questions(26,5,1,"F","How do you spend your time","","","","");
        Questions q27=new Questions(27,5,2,"F","How do you spend your time","","","","");
        Questions q28=new Questions(28,5,2,"F","List out your strategy that you can use to manage difficulties","","","","");
        Questions q29=new Questions(29,5,3,"F","Do you feel lonely always","","","","");
        Questions q30=new Questions(30,5,3,"M","How you feel happy","Dancing","Music","Novels","Web Series");

        questionList.add(new Questions(1,1,1,"F","Are you likely to face some difficulties in implemneting your plan?,List them out","","","",""));
        questionList.add(q2);
        ques.save(q1);
        ques.save(q2);
        ques.save(q3);
        ques.save(q4);
        ques.save(q5);
        ques.save(q6);
        ques.save(q7);
        ques.save(q8);
        ques.save(q9);
        ques.save(q10);
        ques.save(q11);
        ques.save(q12);
        ques.save(q13);
        ques.save(q14);
        ques.save(q15);
        ques.save(q16);
        ques.save(q17);
        ques.save(q18);
        ques.save(q19);
        ques.save(q20);
        ques.save(q21);
        ques.save(q22);
        ques.save(q23);
        ques.save(q24);
        ques.save(q25);
        ques.save(q26);
        ques.save(q27);
        ques.save(q28);
        ques.save(q29);
        ques.save(q30);
    }

    @GetMapping("/GetAllQues")
    public ResponseEntity<ArrayList<Questions>> getAllQuestions()
    {
        ArrayList<Questions> locations=(ArrayList<Questions>) ques.findAll();
        return  ResponseEntity.ok(locations);
    }

    @GetMapping("/GetBySection/{SectionId}")
    public ResponseEntity<ArrayList<Questions>> getAllQuestions(@PathVariable Integer SectionId)
    {
        ArrayList<Questions> locations=(ArrayList<Questions>) ques.getBySection(SectionId);
        return  ResponseEntity.ok(locations);
    }
}