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
    @Column(unique = true)
    private int uid; // user id
    private Date loginTime;
    private Date logoutTime;
    private boolean usefulSession;

    public Timestamp(int uid, Date loginTime, Date logoutTime, boolean usefulSession) {
        this.uid = uid;
        this.loginTime = loginTime;
        this.logoutTime = logoutTime;
        this.usefulSession = usefulSession;
    }
}
