package com.example.LoginService.model;

import lombok.*;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@ToString
public class LoginRequest {
    private String username;
    private String password;
    private String role; // PATIENT, DOCTOR, SPECIALIST, ADMIN
}
