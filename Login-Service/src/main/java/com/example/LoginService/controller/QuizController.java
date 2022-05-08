package com.example.LoginService.controller;

import com.example.LoginService.DTO.Content;
import com.example.LoginService.DTO.ResModel;
import com.example.LoginService.dao.QuizRepository;
import com.example.LoginService.model.Quiz;
import com.example.LoginService.service.QuizService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import com.example.LoginService.DTO.ResModel;

import javax.annotation.PostConstruct;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;

@CrossOrigin("*")
@RestController
public class QuizController {
    public List<String> list;
    @Autowired
    private QuizRepository que;
    @Autowired
    private QuizService quizService;

    @PostMapping("/addQuiz")
    public ResponseEntity<?> addQuiz(@RequestBody ResModel quiz){
        return ResponseEntity.ok(quizService.addQuiz(quiz));
    }

    @GetMapping("/analytics/{id}")
   public Integer getBySectionId(@PathVariable("id") int userId){
        List<Quiz> r=que.findById(userId);
        HashSet<Integer> set=new HashSet<>();
        for(int i=0;i<r.size();i++) {
//            System.out.println(r);
            set.add(r.get(i).getSectionId());
        }
        return set.size();

   }

    @GetMapping("/getlist")
    public List<String> getBySectionId(){
        list.add("nikunj");
        list.add("srikanth");
        return list;
    }
    @GetMapping("/completed/{id}/{sectionid}")
    public int SectionCompleted(@PathVariable(value="id")int userid,@PathVariable(value="sectionid")int sectionid)
    {
        int completed=quizService.completed(userid, sectionid);
        return completed;
    }
    @GetMapping("/GetResponse/{id}/{sectionid}")
    public ResponseEntity<List<Quiz>> getResponse(@PathVariable(value="id")int userid,@PathVariable(value="sectionid")int sectionid)
    {
        List<Quiz> p=quizService.getResponse(userid,sectionid);
        return ResponseEntity.ok(p);
    }
    @GetMapping("/DoctorView/{id}")
    public ResponseEntity<List<Quiz>> getDoctorView(@PathVariable(value="id") int userId)
    {
        List<Quiz> q=quizService.getDoctorView(userId);

        return ResponseEntity.ok(q);
    }
    @GetMapping("/ViewResponse/{id}")
    public ResponseEntity<List<Content>> getAllResponse(@PathVariable(value="id")int userid)
    {
        List<Content> n=quizService.getAllResponse(userid);
        return ResponseEntity.ok(n);
    }

//    @PostConstruct
//    @RequestMapping("/add")
    public void populate()
    {
        quizService.populate();
        return;
    }
}
