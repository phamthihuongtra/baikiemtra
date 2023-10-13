package com.example.demo7.service;

import com.example.demo7.ConnectionJDBC;
import com.example.demo7.Student;

import java.sql.PreparedStatement;
import java.sql.SQLException;

public class studentDAO implements studentService {
    @Override
    public void insertStudent(Student student) throws SQLException {
        ConnectionJDBC connectionJDBC = new ConnectionJDBC();
        String query = "insert into student(name,age,address) values(?,?,?)";
        PreparedStatement preparedStatement = connectionJDBC.connection().prepareStatement(query);
        preparedStatement.setString(1,student.getName());
        preparedStatement.setInt(2,student.getAge());
        preparedStatement.setString(3,student.getAddress());
        preparedStatement.executeUpdate();
    }
}
