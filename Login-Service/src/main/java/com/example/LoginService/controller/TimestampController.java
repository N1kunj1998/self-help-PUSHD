package com.example.LoginService.controller;

import com.example.LoginService.model.Quiz;
import com.example.LoginService.model.Timestamp;
import com.example.LoginService.service.TimestampService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin("*")
@RestController
public class TimestampController {
    public List<String> list;
    @Autowired
    private TimestampService timestampService;

    @PostMapping("/addTimestamp")
    public ResponseEntity<?> addTimestamp(@RequestBody Timestamp timestamp){
        return ResponseEntity.ok(timestampService.addTimestamp(timestamp));
    }

    @GetMapping("/getTimestamp/{uid}")
    public ResponseEntity<?> getBySectionId(@PathVariable("uid") int userId){
        return ResponseEntity.ok(timestampService.getTimestamp(userId));
    }
}
