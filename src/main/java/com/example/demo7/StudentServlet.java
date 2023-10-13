package com.example.demo7;
import com.example.demo7.service.studentDAO;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

@WebServlet (name = "StudentServlet" ,value = "/newStudent")
public class StudentServlet extends HttpServlet {
    ConnectionJDBC connectionJDBC=new ConnectionJDBC();


    private studentDAO studentDAO = new studentDAO();

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String id = req.getParameter("id");
        String name = req.getParameter("name");
        String address = req.getParameter("address");
        int age = Integer.parseInt(req.getParameter("age"));
//        connectionJDBC.connection();


//        System.out.println("Id:" +id);
//        System.out.println("Name:" +name);
//        System.out.println("Age:" +age);
//        System.out.println("Address:" +address);

        Student student = new Student(id, name, address, age);
        try {
            studentDAO.insertStudent(student);
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        req.setAttribute("resul", student);


        Student[] listStudent = new Student[10];
        for (int i = 0; i < 10; i++){
            listStudent[i] = new Student(id, name, address, age);
        }
        req.setAttribute("list", listStudent);
        req.getRequestDispatcher("taoMoi.jsp").forward(req,resp);



    }
}

