package com.example.demo.dao;

import com.example.demo.model.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

@Repository
public class FakeStudentDao implements StudentDao {
    private static List<Student> Database;
    {
        Database = new ArrayList();
        Database.add(new Student(UUID.randomUUID(), "student1"));
        Database.add(new Student(UUID.randomUUID(), "student2"));
    }
    @Override
    public List<Student> selectAllStudents() {
        return Database;
    }

    @Override
    public int insertStudent(UUID id, Student student) {
        return 0;
    }
}
