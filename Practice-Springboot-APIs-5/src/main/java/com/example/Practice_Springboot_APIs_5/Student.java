package com.example.Practice_Springboot_APIs_5;

public class Student {
    private int studentId;
    private String studentName;
    private String grade;



    public Student(int studentId, String studentName, String grade) {

      this.studentId = studentId;
        this.studentName = studentName;
       this.grade = grade;
    }



    public int getStudentId() {
        return studentId;
    }

    public String getStudentName() {
        return studentName;
    }

    public String getGrade() {
        return grade;
    }



    public void setStudentName(String studentName) {
      this.studentName = studentName;
    }

    public void setGrade(String grade) {
       this.grade = grade;
    }
}

