package com.example.LoginService.service;

import com.example.LoginService.DTO.Content;
import com.example.LoginService.DTO.ResModel;
import com.example.LoginService.dao.QuestionRepository;
import com.example.LoginService.dao.QuizRepository;
import com.example.LoginService.dao.TimestampRepo;
import com.example.LoginService.model.Quiz;
import com.example.LoginService.model.Timestamp;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class QuizService {
    @Autowired
    private QuizRepository quizRepository;
    @Autowired
    private QuestionRepository ques1;
    @Autowired
    private TimestampRepo timestampRepo;

    public Quiz addQuiz(ResModel quiz){
        Integer SectionId=ques1.findSectionById(quiz.getQid());
        Integer SubSection= ques1.findSubSectionById(quiz.getQid());
        Quiz q=new Quiz(SectionId,SubSection, quiz.getQid(), quiz.getPatient(), quiz.getResponse());
        return quizRepository.save(q);
    }

    public Integer completed(Integer userid,Integer SectionId)
    {
        Integer m=quizRepository.findByIdandSectionId(userid, SectionId);
        if(m!=5)
            return 0;
        else
            return 1;

    }

    public ArrayList<Quiz> getResponse(int userid, int sectionid)
    {
        ArrayList<Quiz> p=quizRepository.findResponsebyIdandSectionId(userid,sectionid);
        return p;
    }

    public ArrayList<Quiz> getDoctorView(int userid)
    {
        ArrayList<Quiz> details =(ArrayList<Quiz>) quizRepository
                .findById(userid);
        return details;
    }
    public List<Content> getAllResponse(int userid)
    {
        ArrayList<Quiz> details=(ArrayList<Quiz>)quizRepository.findById(userid);
        List<Content> ques=new ArrayList<>();
        for(int i=0;i< details.size();i++)
        {

            String m= ques1.findByQId(details.get(i).getQid());
            Content p=new Content(details.get(i).getPatient(),details.get(i).getQid(),details.get(i).getSectionId(),details.get(i).getSubsectionId(),m,details.get(i).getResponse());
            ques.add(p);
        }
        return ques;
    }

    public void populate() {
        Quiz q1=new Quiz(1,1,1,24,"yes");
        quizRepository.save(q1);
        Quiz q2=new Quiz(1,1,2,24,"no");
        quizRepository.save(q2);
        Quiz q3=new Quiz(1,2,3,24,"yes");
        quizRepository.save(q3);
        Quiz q4=new Quiz(1,2,4,24,"dancing");
        quizRepository.save(q4);
        Quiz q5=new Quiz(1,3,5,24,"no");
        quizRepository.save(q5);
        Quiz q6=new Quiz(1,3,6,24,"music");
        quizRepository.save(q6);
        Quiz q7=new Quiz(2,1,7,24,"meditation");
        quizRepository.save(q7);
        Quiz q8=new Quiz(2,1,8,24,"no");
        quizRepository.save(q8);
        Quiz q9=new Quiz(2,2,9,24,"yes");
        quizRepository.save(q9);
        Quiz q10=new Quiz(2,2,10,24,"yes");
        quizRepository.save(q10);
        Quiz q11=new Quiz(2,3,11,24,"no");
        quizRepository.save(q11);
        Quiz q12=new Quiz(2,3,12,24,"yes");
        quizRepository.save(q12);
        Quiz q13=new Quiz(3,1,13,24,"yes");
        quizRepository.save(q13);
        Quiz q14=new Quiz(3,1,14,24,"no");
        quizRepository.save(q14);
        Quiz q15=new Quiz(3,2,15,24,"yes");
        quizRepository.save(q15);
        Quiz q16=new Quiz(3,2,16,24,"yes");
        quizRepository.save(q16);
        Quiz q17=new Quiz(3,3,17,24,"no");
        quizRepository.save(q17);
        Quiz q18=new Quiz(3,3,18,24,"yes");
        quizRepository.save(q18);
        Quiz q19=new Quiz(4,1,19,24,"yes");
        quizRepository.save(q19);
        Quiz q20=new Quiz(4,1,20,24,"no");
        quizRepository.save(q20);
        Quiz q21=new Quiz(4,2,21,24,"yes");
        quizRepository.save(q21);
        Quiz q22=new Quiz(4,2,22,24,"yes");
        quizRepository.save(q22);
        Quiz q23=new Quiz(4,3,23,24,"music");
        quizRepository.save(q23);
        Quiz q24=new Quiz(4,3,24,24,"yes");
        quizRepository.save(q24);
        Quiz q25=new Quiz(5,1,25,24,"yes");
        quizRepository.save(q25);
        Quiz q26=new Quiz(5,1,26,24,"no");
        quizRepository.save(q26);
        Quiz q27=new Quiz(5,2,27,24,"yes");
        quizRepository.save(q27);
        Quiz q28=new Quiz(5,2,28,24,"yes");
        quizRepository.save(q28);
        Quiz q29=new Quiz(5,3,29,24,"no");
        quizRepository.save(q29);
        Quiz q30=new Quiz(5,3,30,24,"music");
        quizRepository.save(q30);
        Quiz q31=new Quiz(1,1,1,16,"yes");
        quizRepository.save(q31);
        Quiz q32=new Quiz(1,1,2,16,"no");
        quizRepository.save(q32);
        Quiz q33=new Quiz(1,2,3,16,"yes");
        quizRepository.save(q33);
        Quiz q34=new Quiz(1,1,1,18,"yes");
        quizRepository.save(q34);
        Quiz q35=new Quiz(1,1,2,18,"no");
        quizRepository.save(q35);
        Quiz q36=new Quiz(1,2,3,181,"yes");
        quizRepository.save(q36);
    }
}
