package com.example.demo.service;

import com.example.demo.dao.FakeStudentDao;
import com.example.demo.dao.StudentDao;
import com.example.demo.model.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class StudentService {
    private FakeStudentDao studentDao;

    @Autowired
    public StudentService(FakeStudentDao studao) {
        this.studentDao = studao;
    }

    public List<Student> getAllStudent(){

        return studentDao.selectAllStudents();
    }

}
