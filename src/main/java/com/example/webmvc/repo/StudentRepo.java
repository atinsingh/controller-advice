package com.example.webmvc.repo;

import com.example.webmvc.BadNameException;
import com.example.webmvc.DuplicateIdentifyException;
import com.example.webmvc.domain.Student;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class StudentRepo {
    private List<Student> studentList = new ArrayList<>();

    public Student createStudent(Student student){
        if(student.getFirstName()==null) {
            throw new BadNameException("Student Name can't be null");
        }
        if(student.getLastName()==null) {
            throw new BadNameException("Student Name can't be null");
        }

        long cnt = studentList.stream().filter(s->s.getId()==student.getId()).count();
        if(cnt!=0){
            throw new DuplicateIdentifyException(String.format("Student with id %d aleady exist", student.getId()));
        }
        studentList.add(student);
        return student;

    }
}
