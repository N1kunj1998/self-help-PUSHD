package com.example.LoginService.controller;

import com.example.LoginService.service.EmailService;
import com.example.LoginService.service.FetchemailService;
import org.apache.coyote.Response;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@CrossOrigin("*")
@RestController
public class TestController {
//    List<String> list;

//    @GetMapping("/getlist")
//    public ResponseEntity<?> getList(){
//        list.add("nikunj");
//        list.add("steve");
//        return ResponseEntity.ok("test");
//    }


    @Autowired
    private EmailService emailservice;

    @Autowired
    private FetchemailService fetchemailService;


    @GetMapping("/cronTest")
    public void send(){
        String subject ="set your Meal";
        String message="If You have not selected Your meal, Please Fill it before 12:01 am";
        List<String> email= fetchemailService.fetchallemail();
        for (int i = 0; i < email.size(); i++) {
            String to= email.get(i);
            emailservice.sendEmail(subject,message,to);
        }
    }
}
