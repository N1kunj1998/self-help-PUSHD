package com.example.LoginService.controller;

import com.example.LoginService.config.CustomUserDetails;
import com.example.LoginService.helper.JwtUtil;
import com.example.LoginService.model.ForgotPasswordRequest;
import com.example.LoginService.model.JwtResponse;
import com.example.LoginService.model.LoginRequest;
import com.example.LoginService.model.LoginTable;
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

import javax.validation.Valid;

@RestController
public class LoginController {
    @Autowired
    private LoginTableService loginTableService;

    @Autowired
    private AuthenticationManager authenticationManager;

    @Autowired
    private JwtUtil jwtUtil;

    @PostMapping("/signup")
    public LoginTable register(@RequestBody LoginTable login){

//        System.out.println("checking -> " + request);
//        LoginTable loginExits = loginTableService.findLoginByUsername(login.getUsername());
//        if(loginExits != null) {
//            result.rejectValue("username", "error.user",
//                    "There is already a user registered with the user name provided");
//        }
        return loginTableService.saveLogin(login);
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
