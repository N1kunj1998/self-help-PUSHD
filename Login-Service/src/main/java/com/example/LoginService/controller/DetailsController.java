package com.example.LoginService.controller;

import com.example.LoginService.dao.PatientRepository;
import com.example.LoginService.model.Doctor;
import com.example.LoginService.model.Patient;
import com.example.LoginService.model.Specialist;
import com.example.LoginService.service.DoctorService;
import com.example.LoginService.service.PatientService;
import com.example.LoginService.service.SpecialistService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@CrossOrigin("*")
@RestController
public class DetailsController {
    @Autowired
    private PatientService patientService;

    @Autowired
    private DoctorService doctorService;

    @Autowired
    private SpecialistService specialistService;

    @GetMapping("/patientDetailsDoc/{did}")
    public ResponseEntity<?> patientDetails(@PathVariable(value = "did") String did){

        return ResponseEntity.ok(patientService.getPatientsByDocId(did));
    }

    @PostMapping("/populate")
    public ResponseEntity<?> populate(){
        patientService.populate();
        return ResponseEntity.ok("Working");
    }

    @PostMapping("/populatedoctor")
    public ResponseEntity<?> populatedoctor(){
        doctorService.populate();
        return ResponseEntity.ok("Working");
    }

    @PostMapping("/skippable/{id}/{skip}")
    public ResponseEntity<?> skippable(@PathVariable(value = "id") int id, @PathVariable(value = "skip") String skip){
        System.out.println(id + " -> " + skip);
        return ResponseEntity.ok(patientService.addSkippable(id, skip));
    }

    @GetMapping("/getSkippable/{id}")
    public ResponseEntity<?> getSkippable(@PathVariable(value = "id") int id){
        return ResponseEntity.ok(patientService.getSkippable(id));
    }

    @PostMapping("/addSpecialist")
    public ResponseEntity<?> addSpecialist(@RequestBody Specialist specialist){
        return ResponseEntity.ok(specialistService.addDetails(specialist));
    }

    @PostMapping("/addDoctor")
    public ResponseEntity<?> addDoctor(@RequestBody Doctor doctor){
        return ResponseEntity.ok(doctorService.addDetails(doctor));
    }

    @GetMapping("/patientDetails/{id}")
    public ResponseEntity<?> patientDetails(@PathVariable("id") int id){
        return ResponseEntity.ok(patientService.patientDetails(id));
    }

    @PostMapping("/addPatientDetails")
    public ResponseEntity<?> addPatientDetails( @RequestBody Patient patient){
        return ResponseEntity.ok(patientService.addPatientDetails(patient));
    }
}
