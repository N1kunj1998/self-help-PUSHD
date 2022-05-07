package com.example.LoginService.DTO;

public class Content {
    int userid;
    int qid;
    int sectionid;
    int subsection_id;
    String QuesContent;
    String Response;

    public Content(int userid, int qid, int sectionid, int subsection_id, String quesContent, String response) {
        this.userid = userid;
        this.qid = qid;
        this.sectionid = sectionid;
        this.subsection_id = subsection_id;
        QuesContent = quesContent;
        Response = response;
    }

    public int getUserid() {
        return userid;
    }

    public void setUserid(int userid) {
        this.userid = userid;
    }

    public int getQid() {
        return qid;
    }

    public void setQid(int qid) {
        this.qid = qid;
    }

    public int getSectionid() {
        return sectionid;
    }

    public void setSectionid(int sectionid) {
        this.sectionid = sectionid;
    }

    public int getSubsection_id() {
        return subsection_id;
    }

    public void setSubsection_id(int subsection_id) {
        this.subsection_id = subsection_id;
    }

    public String getQuesContent() {
        return QuesContent;
    }

    public void setQuesContent(String quesContent) {
        QuesContent = quesContent;
    }

    public String getResponse() {
        return Response;
    }

    public void setResponse(String response) {
        Response = response;
    }
}
