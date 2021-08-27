package com.example.webmvc.controller;

import com.example.webmvc.domain.Student;
import com.example.webmvc.repo.StudentRepo;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
public class StudentController {

    private final StudentRepo repo;

    @PostMapping("/student")
    public ResponseEntity<?> createStudent(@RequestBody Student student){
        return ResponseEntity.accepted().body(repo.createStudent(student));
    }

    @GetMapping
    public Student getStudent(){
        return null;
    }


}
