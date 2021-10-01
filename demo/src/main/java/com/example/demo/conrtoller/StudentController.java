package com.example.demo.conrtoller;

import com.example.demo.model.Student;
import com.example.demo.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.UUID;

//the
@RestController
@RequestMapping("api/student")
public class StudentController {
    private StudentService studentService;

    @Autowired
    public StudentController(StudentService studentService) {
        this.studentService = studentService;
    }

    @GetMapping
    @RequestMapping("/h1")
    public Student helloWorld1(){
        Student s = new Student(UUID.randomUUID(), "test_name");
        //need to convert student object to json (serialize)
        return s;
    }
    @GetMapping
    @RequestMapping("/h2")
    public List<Student> helloWorld2(){
        return studentService.getAllStudent();
    }

    @GetMapping
    @RequestMapping("/h3")
    public String helloWorld3(){
        return "hello";
    }

}
