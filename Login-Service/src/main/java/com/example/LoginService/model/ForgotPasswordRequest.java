package com.example.LoginService.model;

import lombok.*;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@ToString
public class ForgotPasswordRequest {
    private String username;
    private String email;
    private String password;
    private String role; // PATIENT, DOCTOR, SPECIALIST, ADMIN
}
