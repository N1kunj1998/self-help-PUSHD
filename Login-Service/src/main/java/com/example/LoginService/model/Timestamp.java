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
public class Timestamp {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int tid; // timestamp id
    private int uid; // user id
    private Date timestamp;
    private boolean usefulSession;
}
