package com.example.LoginService.DTO;

public class ResModel {
    int qid;
    int patient;
    String response;

    public int getQid() {
        return qid;
    }

    public void setQid(int qid) {
        this.qid = qid;
    }

    public int getPatient() {
        return patient;
    }

    public void setPatient(int patient) {
        this.patient = patient;
    }

    public String getResponse() {
        return response;
    }

    public void setResponse(String response) {
        this.response = response;
    }

    public ResModel(int qid, int patient, String response) {
        this.qid = qid;
        this.patient = patient;
        this.response = response;
    }
}
