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

    public Timestamp addTimestamp(Timestamp ts){
        ts.setTimestamp(new Date());
        return timestampRepo.save(ts);
    }

    public Timestamp getTimestamp(int uid){
        List<Timestamp> timestampList = timestampRepo.getTimestampByUid(uid);
        timestampList.get(timestampList.size()-1);
        return null;
    }
}
