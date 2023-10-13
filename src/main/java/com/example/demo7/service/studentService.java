package com.example.demo7.service;

import com.example.demo7.Student;

import java.sql.SQLException;

public interface studentService {
    void insertStudent(Student student) throws SQLException;
}
