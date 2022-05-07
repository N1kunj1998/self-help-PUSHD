package com.example.LoginService.service;

import com.example.LoginService.DTO.Content;
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

    public Quiz addQuiz(Quiz quiz){
        int uid = quiz.getPatient();
        List<Timestamp> timestampList = timestampRepo.getTimestampByUserId(uid);
        Timestamp ts = timestampList.get(timestampList.size() - 1);
        ts.setUsefulSession(true);
        timestampRepo.save(ts);
        return quizRepository.save(quiz);
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
}
