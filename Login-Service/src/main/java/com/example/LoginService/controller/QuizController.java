package com.example.LoginService.controller;

import com.example.LoginService.model.Quiz;
import com.example.LoginService.service.QuizService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@CrossOrigin("*")
@RestController
public class QuizController {

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
}
