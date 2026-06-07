package com.example.Practice_Springboot_APIs_5;

public class Student {
    private int StudentId;
    private String StudentName;
    private String Grade;



    public Student(int studentID, String studentName, String grade) {
        StudentId = studentID;
        StudentName = studentName;
        Grade = grade;
    }



    public int getStudentID() {
        return StudentId;
    }

    public String getStudentName() {
        return StudentName;
    }

    public String getGrade() {
        return Grade;
    }



    public void setStudentName(String studentName) {
        StudentName = studentName;
    }

    public void setGrade(String grade) {
        Grade = grade;
    }
}

