package com.example.LoginService.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class QuizRes {
    private int id;
    private int sectionId;
    private int subsectionId;
    private int patient;
    private String que;
    private String response;
}
