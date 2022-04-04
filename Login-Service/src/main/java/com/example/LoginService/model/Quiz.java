package com.example.LoginService.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import javax.persistence.*;

@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
@Entity
@Table()
public class Quiz {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;
    private int sectionId;
    private int subsectionId;
    private int qid;
    private int patient;
    private String response;

    public Quiz(int sectionId, int subsectionId, int qid, int patient, String response) {
        this.sectionId = sectionId;
        this.subsectionId = subsectionId;
        this.qid = qid;
        this.patient = patient;
        this.response = response;
    }
}
