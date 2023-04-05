package com.elie.studentportal.controller;

import com.elie.studentportal.model.Student;
import com.elie.studentportal.service.StudentServiceImp;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/student")
@CrossOrigin
public class StudentController {

    @Autowired
    StudentServiceImp studentServiceImp;

    @PostMapping("/add")
    public String addStudent( @RequestBody Student student){
        return studentServiceImp.addStudent(student);
    }
    @GetMapping
    public List<Student> findALlStudents(){
        return studentServiceImp.findAllStudent();
    }
}
