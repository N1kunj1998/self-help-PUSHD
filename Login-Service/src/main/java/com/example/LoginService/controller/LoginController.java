package com.example.LoginService.controller;


import com.example.LoginService.config.CustomUserDetails;
import com.example.LoginService.dao.DoctorRepository;
import com.example.LoginService.dao.LoginTableRepository;
import com.example.LoginService.dao.PatientRepository;
import com.example.LoginService.helper.JwtUtil;
import com.example.LoginService.model.Doctor;
import com.example.LoginService.model.ForgotPasswordRequest;
import com.example.LoginService.model.JwtResponse;
import com.example.LoginService.model.LoginRequest;
import com.example.LoginService.model.LoginTable;
import com.example.LoginService.model.Patient;
import com.example.LoginService.service.LoginTableService;
import lombok.extern.java.Log;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.query.Param;
import org.springframework.http.ResponseEntity;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.BadCredentialsException;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;

import javax.annotation.PostConstruct;
import javax.validation.Valid;
import java.text.SimpleDateFormat;

@CrossOrigin("*")
@RestController
public class LoginController {
    @Autowired
    private LoginTableService loginTableService;

    @Autowired
    private AuthenticationManager authenticationManager;

    @Autowired
    private LoginTableRepository doc;

    @Autowired
    private DoctorRepository doc1;

    @Autowired
    private PatientRepository pat;

    @Autowired
    private JwtUtil jwtUtil;

//    @PostConstruct
//    @RequestMapping("/add")
//    public void add()
//    {   Doctor d1=new Doctor(1,"sreya","27-8-1991","sreya","gupta","20");
//        doc1.save(d1);
//        LoginTable doc11=new LoginTable("sreya","abcd1234","sg@gmail.com","ROLE_DOCTOR",true);
//        doc.save(doc11);
//        Doctor d2=new Doctor(2,"john",27-9-1991,"john","shaw","20");
//        doc1.save(d2);
//        LoginTable doc2=new LoginTable("john","yuzx","john@gmail","ROLE_DOCTOR",true);
//        doc.save(doc2);
//        Doctor d3=new Doctor(3,"priya",27-9-1992,"priya","shaw","25");
//        doc1.save(d3);
//        LoginTable doc3=new LoginTable("priya","cvnx","priya@gmail","ROLE_DOCTOR",true);
//        doc.save(doc3);
//        Patient x=new Patient("srey",27-8-1992,"sreya","roy",1);
//        pat.save(x);
//        LoginTable p1=new LoginTable("srey","abcd1234","s1g@gmail.com","ROLE_PATIENT",true);
//        doc.save(p1);
//        Patient y=new Patient("aman",21-8-1992,"aman","roy",1);
//        pat.save(y);
//        LoginTable p2=new LoginTable("aman","ona1234","p1g@gmail.com","ROLE_PATIENT",true);
//        doc.save(p2);
//        Patient z=new Patient("roy",21-8-1992,"roy","shaw",2);
//        pat.save(z);
//        LoginTable p3=new LoginTable("roy","qwerty1234","r1g@gmail.com","ROLE_PATIENT",true);
//        doc.save(p3);
//        Patient a=new Patient("alex",21-8-1992,"alex","shaw",2);
//        pat.save(a);
//        LoginTable p4=new LoginTable("alex","aa1234","a1g@gmail.com","ROLE_PATIENT",true);
//        doc.save(p4);
//        Patient b=new Patient("tina",21-8-1992,"tina","shaw",2);
//        pat.save(b);
//        LoginTable p5=new LoginTable("tina","abcd1234","t1g@gmail.com","ROLE_PATIENT",true);
//        doc.save(p5);
//        Patient c=new Patient("troy",21-8-1992,"troy","shaw",1);
//        pat.save(c);
//        LoginTable p6=new LoginTable("troy","ona1234","ty1g@gmail.com","ROLE_PATIENT",true);
//        doc.save(p6);
//        Patient d=new Patient("tony",21-8-1992,"tony","mehta",3);
//        pat.save(d);
//        LoginTable p7=new LoginTable("tony","tony1234","h1g@gmail.com","ROLE_PATIENT",true);
//        doc.save(p7);
//        Patient e=new Patient("harry",21-8-1992,"harry","mehta",3);
//        pat.save(e);
//        LoginTable p8=new LoginTable("harry","h1234","harry1g@gmail.com","ROLE_PATIENT",true);
//        doc.save(p8);
//
//    }
    @PostMapping("/signup")
    public ResponseEntity<?> register(@RequestBody LoginTable login){

//        System.out.println("checking -> " + request);
//        LoginTable loginExits = loginTableService.findLoginByUsername(login.getUsername());
//        if(loginExits != null) {
//            result.rejectValue("username", "error.user",
//                    "There is already a user registered with the user name provided");
//        }
        return ResponseEntity.ok(loginTableService.saveLogin(login));
    }

    @PostMapping("/login")
    public ResponseEntity<?> login(@RequestBody LoginRequest request){
        return ResponseEntity.ok(loginTableService.login(request));
    }

    @GetMapping("/signin")
    public ResponseEntity<?> signup(@RequestBody LoginRequest request) throws Exception{
//        System.out.println(request);
//        try{
//            authenticationManager.authenticate(new UsernamePasswordAuthenticationToken(request.getUsername(), request.getPassword()));
//        }catch (UsernameNotFoundException e){
//            e.printStackTrace();
//            throw new Exception("Bad Credentials");
//        }catch (BadCredentialsException e){
//            e.printStackTrace();
//            throw new Exception("Bad Credentials");
//        }
//
//        return null;

        return ResponseEntity.ok(loginTableService.login(request));

        // fine area..

//        UserDetails userDetails = customUserDetails.loadUserByUsername(request.getUsername());
//        UserDetails userDetails = loginTableService.findLoginByUsername(request.getUsername());

//        String token = jwtUtil.generateToken(login);
//        System.out.println("JWT " + token);

        // {"token" : "value"}
//        return ResponseEntity.ok(new JwtResponse(token));
    }

    @PostMapping("/reset")
    public ResponseEntity<?> resetPassword(@RequestBody LoginRequest request){
        return ResponseEntity.ok(loginTableService.resetPassword(request));
    }

//    @PostMapping("/forgotPassword")
//    public ResponseEntity<?> forgotPassword(@RequestBody ForgotPasswordRequest request){
//        return ResponseEntity.ok(loginTableService.forgotPassword(request));
//    }


    @GetMapping("/hello")
    public String hello(){
        return "<h1>Hello</h1>";
    }

    @GetMapping("/getAllDetails")
    public ResponseEntity<?> getLoginDetails(){
        return ResponseEntity.ok(loginTableService.findAllLogin());
    }

    @GetMapping("/getDetails/{id}")
    public ResponseEntity<?> getDetails(@PathVariable("id") int id){
        return ResponseEntity.ok(loginTableService.getDetails(id));
    }
}