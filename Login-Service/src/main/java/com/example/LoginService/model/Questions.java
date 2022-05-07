package com.example.LoginService.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "Questions")
public class Questions {

    public Questions() {
        super();
        // TODO Auto-generated constructor stub
    }


    @Id
    private int qid;
    private int sectionId;
    private int subSectionId;
    private String type;
    private String Content;
    private String A;
    private String B;
    private String C;
    private String D;
    public int getQid() {
        return qid;
    }
    public void setQid(int qid) {
        this.qid = qid;
    }
    public int getSectionId() {
        return sectionId;
    }
    public void setSectionId(int sectionId) {
        this.sectionId = sectionId;
    }
    public int getSubSectionId() {
        return subSectionId;
    }
    public void setSubSectionId(int subSectionId) {
        this.subSectionId = subSectionId;
    }
    public String getType() {
        return type;
    }
    public void setType(String type) {
        this.type = type;
    }
    public String getContent() {
        return Content;
    }
    public void setContent(String content) {
        Content = content;
    }
    public String getA() {
        return A;
    }
    public void setA(String a) {
        A = a;
    }
    public String getB() {
        return B;
    }
    public void setB(String b) {
        B = b;
    }
    public String getC() {
        return C;
    }
    public void setC(String c) {
        C = c;
    }
    public String getD() {
        return D;
    }
    public void setD(String d) {
        D = d;
    }
    public Questions(int qid, int sectionId, int subSectionId, String type, String content, String a, String b,
                     String c, String d) {
        super();
        this.qid = qid;
        this.sectionId = sectionId;
        this.subSectionId = subSectionId;
        this.type = type;
        Content = content;
        A = a;
        B = b;
        C = c;
        D = d;
    }
}