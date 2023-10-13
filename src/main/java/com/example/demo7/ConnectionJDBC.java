package com.example.demo7;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionJDBC {
    private String hostName = "localhost:3306";
    private String databaseName = "sinhvien";
    private String username = "root";
    private String password = "password";
    private String connectionURL = "jdbc:mysql://" + hostName + "/" + databaseName;
    private String query_insert = "insert into student(name, age, address) values (?,?,?)";
    private String query_delete = "delete from student where id = ?";
    private String query_update = "update student set name = ?, age =? , address = ? where id = ?";
    public Connection connection(){
        Connection connection = null;

        try{
            Class.forName("com.mysql.jdbc.Driver");
            connection = DriverManager.getConnection(connectionURL,username,password);
            System.out.println("ket noi thanh cong");
        } catch (SQLException e) {
            e.printStackTrace();
        }catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }
        return connection;
    }
}
