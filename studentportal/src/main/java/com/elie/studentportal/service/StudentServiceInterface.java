package com.elie.studentportal.service;

import com.elie.studentportal.model.Student;

import java.util.List;


public interface StudentServiceInterface {

    public String addStudent(Student student);
    public List<Student> findAllStudent();
}
