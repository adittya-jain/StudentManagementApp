package com.student.manage;

public class Student {
    private int Student_ID;
    private String Student_name;
    private String Phone_no;
    private String Student_City;

    public int getStudent_ID() {
        return Student_ID;
    }

    public void setStudent_ID(int student_ID) {
        Student_ID = student_ID;
    }

    public String getStudent_name() {
        return Student_name;
    }

    public void setStudent_name(String student_name) {
        Student_name = student_name;
    }

    public String getPhone_no() {
        return Phone_no;
    }

    public void setPhone_no(String phone_no) {
        Phone_no = phone_no;
    }

    public String getStudent_City() {
        return Student_City;

    }

    public void setStudent_City(String student_City) {
        Student_City = student_City;
    }

    public Student(int student_ID, String student_name, String phone_no, String student_City) {
        Student_ID = student_ID;
        Student_name = student_name;
        Phone_no = phone_no;
        Student_City = student_City;
    }

    public Student(int student_ID, String student_name, String student_City) {
        Student_ID = student_ID;
        Student_name = student_name;
        Student_City = student_City;
    }

    public Student(int student_ID, String student_name) {
        Student_ID = student_ID;
        Student_name = student_name;
    }

    public Student(String student_name, String phone_no, String student_City) {
        Student_name = student_name;
        Phone_no = phone_no;
        Student_City = student_City;
    }

    public Student() {
        super();
    }

    @Override
    public String toString() {
        return "Student [Student_ID=" + Student_ID + ", Student_name=" + Student_name + ", Phone_no=" + Phone_no
                + ", Student_City=" + Student_City + "]";
    }

    
}
