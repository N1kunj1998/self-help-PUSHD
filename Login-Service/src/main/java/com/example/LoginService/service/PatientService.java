package com.example.LoginService.service;

import com.example.LoginService.dao.DoctorRepository;
import com.example.LoginService.dao.PatientRepository;
import com.example.LoginService.dao.QuizRepository;
import com.example.LoginService.model.Doctor;
import com.example.LoginService.model.Patient;
import com.example.LoginService.model.Quiz;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.Random;

@Service
public class PatientService {
    @Autowired
    public PatientRepository patientRepository;

    @Autowired
    public QuizRepository quizRepository;
    @Autowired
    public DoctorRepository doctorRepository;

    public List<Patient> getPatientsByDocId(String did){
        int docId = Integer.parseInt(did);
        return patientRepository.getPatientsByDocId(docId);
//        patientRepository.findAllById();
//        Patient byId = patientRepository.getById(12);
    }

    public void populate(){
        Patient patient1 = new Patient(23,"ram",new Date(),"ram","Agarwal",2,"12345");
        patientRepository.save(patient1);
    }

//    public Patient addSkippable(int id,String skip){
//        System.out.println(id + " -> " + skip);
//        Patient patient = patientRepository.getById(id);
//        System.out.println(patient);
//        String skippable = patient.getSkippable();
////        Pattern word = Pattern.compile(skip);
////        Matcher match = word.matcher(skippable);
////        int idx = match.start();
//        int idx =  skippable.indexOf(skip);
//        System.out.println(idx);
//        String newSkippable = skippable.substring(0,idx);
//        System.out.println("new skippable" + newSkippable);
//        patient.setSkippable(newSkippable);
//        return patientRepository.save(patient);
//    }
public Patient addSkippable(int id,String skip){
    System.out.println(id + " -> " + skip);
    Patient patient = patientRepository.getById(id);
    patient.setSkippable(skip);
//    System.out.println(patient);
//    String skippable = patient.getSkippable();
//        Pattern word = Pattern.compile(skip);
//        Matcher match = word.matcher(skippable);
//        int idx = match.start();
//    int idx =  skippable.indexOf(skip);
//    System.out.println(idx);
//    String newSkippable = skippable.substring(0,idx);
//    System.out.println("new skippable" + newSkippable);
//    patient.setSkippable(newSkippable);
    return patientRepository.save(patient);
}

    public Patient patientDetails(int id) {
        return patientRepository.findById(id).orElse(null);
    }

    public Patient addPatientDetails(Patient patient) {
        Random rand = new Random();
        List<Doctor> doctorList = doctorRepository.findAll();
        int idx = rand.nextInt(doctorList.size());
        patient.setDocId(idx);
        patient.setDateOfBirth(new Date());
        return patientRepository.save(patient);
    }


    public List<Quiz> getDoctorView(int userid)
    {
        List<Quiz> details = quizRepository.findById(userid);

        return details;
    }

    public String getSkippable(int id) {
        return patientRepository.getById(id).getSkippable();
    }
}
