package com.student.manage;

import java.sql.*;

public class ConnectionProvider {
    
    static Connection connection;

    public static Connection CreateConnection() {
        
        try {
            
            //Load the driver
            Class.forName("com.mysql.cj.jdbc.Driver");

            //Create the connection
            connection = DriverManager.getConnection("jdbc:mysql://localhost:3369/student_manage", "root", "root");

        } catch (Exception e) {
            e.printStackTrace();
        }
        return connection;
    }
}
