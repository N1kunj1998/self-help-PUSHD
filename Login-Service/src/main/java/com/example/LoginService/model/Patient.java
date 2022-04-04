package com.example.LoginService.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;

@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
@Entity
@Table()
public class Patient implements Serializable {
    @Id
    private int pid;
    private String username;
    private Date dateOfBirth;
    private String firstname;
    private String lastname;
    private int docId;
    private String skippable;

    public Patient(String username, Date dateOfBirth, String firstname, String lastname, int docId) {
        this.username = username;
        this.dateOfBirth = dateOfBirth;
        this.firstname = firstname;
        this.lastname = lastname;
        this.docId = docId;
    }
}
