package com.example.LoginService.controller;

import com.example.LoginService.model.Quiz;
import com.example.LoginService.service.QuizService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Arrays;
import java.util.List;

@CrossOrigin("*")
@RestController
public class QuizController {
    public List<String> list;

    @Autowired
    private QuizService quizService;

    @PostMapping("/addQuiz")
    public ResponseEntity<?> addQuiz(@RequestBody Quiz quiz){
        return ResponseEntity.ok(quizService.addQuiz(quiz));
    }

    @GetMapping("/analytics/{id}")
    public ResponseEntity<?> getBySectionId(@PathVariable("id") int secId){
        return ResponseEntity.ok(quizService.getBySectionId(secId).size());
    }

    @GetMapping("/getlist")
    public List<String> getBySectionId(){
        list.add("nikunj");
        list.add("paggu");
        return list;
    }
}
