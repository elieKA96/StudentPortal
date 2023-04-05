package com.elie.studentportal.service;

import com.elie.studentportal.model.Student;
import com.elie.studentportal.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentServiceImp implements StudentServiceInterface{

    @Autowired
    StudentRepository studentRepository;

    @Override
    public String addStudent(Student student) {
        Student result = studentRepository.save(student);
        return "Succesful";
    }

    @Override
    public List<Student> findAllStudent() {
        return studentRepository.findAll(Sort.by(Sort.Direction.DESC, "id"));
    }
}
