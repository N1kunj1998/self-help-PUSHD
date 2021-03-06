package com.example.LoginService.helper;


import com.example.LoginService.service.EmailService;
import com.example.LoginService.service.FetchemailService;
//import com.example.service.FetchemailService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class Schedulemail {

    @Autowired
    private EmailService emailservice;

    @Autowired
    private FetchemailService fetchemailService;

    @Scheduled(cron = "0 23 1 * * *")
    public void sentnotification()
    {
        System.out.println("working");
        String subject ="Are You feeling okay";
        String message="Got to your account take some relaxing exercise";
        List<String> email= fetchemailService.fetchallemail();
        for (int i = 0; i < email.size(); i++) {
            String to= email.get(i);
            emailservice.sendEmail(subject,message,to);
        }


    }





}