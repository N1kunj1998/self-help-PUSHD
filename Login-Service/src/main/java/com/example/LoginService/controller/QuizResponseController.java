package com.example.LoginService.controller;

import com.example.LoginService.model.QResponse;
import com.example.LoginService.service.QuizResponseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@CrossOrigin("*")
@RestController
public class QuizResponseController {

    @Autowired
    private QuizResponseService quizResponseService;

    @PostMapping("/postquiz/{uid}/{key}")
    public ResponseEntity<?> addResponse(@PathVariable("uid") String uid,
                                         @PathVariable("key") String key,
                                         @RequestBody QResponse qResponse){
        qResponse.setKey(key);
        qResponse.setUserId(Integer.parseInt(uid));
        System.out.println(qResponse);
        return ResponseEntity.ok(quizResponseService.addResponse(qResponse));
    }

    @GetMapping("/{uid}/{key}")
    public ResponseEntity<?> getResponse(@PathVariable("uid") String uid,
                                         @PathVariable("key") String key){
        return ResponseEntity.ok(quizResponseService.getResponse(key, Integer.parseInt(uid)));
    }
}
