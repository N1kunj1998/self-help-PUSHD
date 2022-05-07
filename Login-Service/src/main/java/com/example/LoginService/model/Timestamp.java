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
    private int userId; // user id
    private String loginTime;
    private String logoutTime;
    private boolean usefulSession;

    public Timestamp(int userId, String loginTime, String logoutTime, boolean usefulSession) {
        this.userId = userId;
        this.loginTime = loginTime;
        this.logoutTime = logoutTime;
        this.usefulSession = usefulSession;
    }
}
