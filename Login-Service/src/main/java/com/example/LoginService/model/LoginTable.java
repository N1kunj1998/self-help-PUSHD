package com.example.LoginService.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import javax.persistence.*;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;

@Entity
@Table
@NoArgsConstructor
@AllArgsConstructor
@ToString
@Data
public class LoginTable {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;
    @NotBlank(message = "Name field is required")
    @Size(min=2, max = 20, message = "min 2 and max 20 characters are allowed !!")
    private String username;
    private String password;
    @Email
    private String email;
    private String role; // PATIENT, DOCTOR, SPECIALIST, ADMIN
    private boolean active;

    public LoginTable(String username, String password, String email, String role, boolean active) {
        this.username = username;
        this.password = password;
        this.email = email;
        this.role = role;
        this.active = active;
    }
}
