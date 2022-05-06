package com.example.LoginService.model;

import lombok.*;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@ToString
public class LoginResponse {
    private int id;
    private String role;
    private boolean validLogin;
}
