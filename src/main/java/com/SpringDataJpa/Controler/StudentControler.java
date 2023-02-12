package com.SpringDataJpa.Controler;

import com.SpringDataJpa.Model.UserStudent;
import com.SpringDataJpa.Repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;


@RestController
public class StudentControler {

    @Autowired
    private StudentRepository studentRepository;

    @PostMapping("/student")
    UserStudent newStudent(
            @RequestBody UserStudent userStudent){
        return studentRepository.save(userStudent);
    }

    @GetMapping("/students")
    List<UserStudent> getAllStudent(){
        return studentRepository.findAll();
    }
}
