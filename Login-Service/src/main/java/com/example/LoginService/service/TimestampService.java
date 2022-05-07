package com.example.LoginService.service;

import com.example.LoginService.dao.TimestampRepo;
import com.example.LoginService.model.Timestamp;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;

@Service
public class TimestampService {
    @Autowired
    private TimestampRepo timestampRepo;

    public Timestamp addLoginTimestamp(Timestamp ts){
        ts.setLoginTime(new Date());
        return timestampRepo.save(ts);
    }

    public Timestamp addLogoutTimestamp(Timestamp ts){
//        ts.setLogoutTime(new Date());
//        Timestamp userTimestamp = timestampRepo.fin;
        List<Timestamp> timestampList = timestampRepo.getTimestampByUid(ts.getUid());
        Timestamp userTimeStamp = timestampList.get(timestampList.size()-1);
        System.out.println(userTimeStamp);
        userTimeStamp.setLogoutTime(new Date());
        return timestampRepo.save(userTimeStamp);
    }

    public Timestamp getTimestamp(int uid){
        List<Timestamp> timestampList = timestampRepo.getTimestampByUid(uid);
        timestampList.get(timestampList.size()-1);
        return null;
    }
}
