package com.student.manage;

import java.sql.*;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class StudentDao {
    public static boolean insertIntoDB(Student student) {
        boolean f = false;
        try {

            Connection connection = ConnectionProvider.CreateConnection();
            String q = "insert into students(student_name,student_phone,student_city) values(?,?,?)";
            PreparedStatement pst = connection.prepareStatement(q);
            pst.setString(1, student.getStudent_name());
            pst.setString(2, student.getPhone_no());
            pst.setString(3, student.getStudent_City());

            pst.executeUpdate();

            f = true;

        } catch (Exception e) {
            e.printStackTrace();
        }
        return f;
    }

    public static boolean deleteIntoDB(int id) {
        boolean f = false;
        try {

            Connection connection = ConnectionProvider.CreateConnection();
            String q = "delete from students where student_id=?";
            PreparedStatement pst = connection.prepareStatement(q);
            pst.setInt(1, id);

            pst.executeUpdate();

            f = true;

        } catch (Exception e) {
            e.printStackTrace();
        }
        return f;
    }

    public static boolean showAllStudents() {
        boolean f = false;
        try {

            Connection connection = ConnectionProvider.CreateConnection();
            String q = "select * from students;";
            // java.sql.Statement st = connection.createStatement();
            // ResultSet set = st.executeQuery(q);
            Statement smt = connection.createStatement();
            ResultSet set = smt.executeQuery(q);

            while (set.next()) {

                int id = set.getInt(1);
                String name = set.getString(2);
                String phone = set.getString(3);
                String city = set.getString(4);

                System.out.println("ID: " + id);
                System.out.println("Name: " + name);
                System.out.println("Phone: " + phone);
                System.out.println("City: " + city);
                System.out.println("++++++++++++++++++++++++++++++++++++");
            }

            f = true;

        } catch (Exception e) {
            e.printStackTrace();
        }
        return f;
    }
}
