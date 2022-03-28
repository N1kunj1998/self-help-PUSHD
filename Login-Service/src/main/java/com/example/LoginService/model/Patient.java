package com.example.LoginService.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import javax.persistence.*;
import java.util.Date;

@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
@Entity
@Table()
public class Patient {
    @Id
    private int pid;
    private String username;
    private String password;
    private Date dateOfBirth;
    private String firstname;
    private String lastname;

    public Patient(String username, String password, Date dateOfBirth, String firstname, String lastname) {
        this.username = username;
        this.password = password;
        this.dateOfBirth = dateOfBirth;
        this.firstname = firstname;
        this.lastname = lastname;
    }
}
