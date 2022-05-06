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
public class QResponse {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int userId;
    private String key;
    private String response;
}
