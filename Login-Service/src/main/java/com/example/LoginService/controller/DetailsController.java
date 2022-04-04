package com.example.LoginService.controller;

import com.example.LoginService.dao.PatientRepository;
import com.example.LoginService.model.Patient;
import com.example.LoginService.service.PatientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DetailsController {
    @Autowired
    PatientService patientService;
    @GetMapping("/patientDetails/{did}")
    public ResponseEntity<?> patientDetails(@PathVariable(value = "did") String did){

        return ResponseEntity.ok(patientService.getPatientsByDocId(did));
    }

    @PostMapping("/populate")
    public ResponseEntity<?> populate(){
        patientService.populate();
        return ResponseEntity.ok("Working");
    }

    @PostMapping("/skippable/{id}/{skip}")
    public ResponseEntity<?> skippable(@PathVariable(value = "id") int id, @PathVariable(value = "skip") String skip){
        System.out.println(id + " -> " + skip);
        return ResponseEntity.ok(patientService.addSkippable(id, skip));
    }
}
