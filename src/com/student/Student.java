package com.student;

public class Student {
    private int studentID;
    private String studentName;
    private String phone;

    public Student(int studentID, String studentName, String phone) {
        this.studentID = studentID;
        this.studentName = studentName;
        this.phone = phone;
    }

    public Student(String studentName, String phone) {
        this.studentName = studentName;
        this.phone = phone;
    }

    public int getStudentID() {
        return studentID;
    }

    public void setStudentID(int studentID) {
        this.studentID = studentID;
    }

    public String getStudentName() {
        return studentName;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    @Override
    public String toString() {
        return "Student{" +
                "studentID=" + studentID +
                ", studentName='" + studentName + '\'' +
                ", phone='" + phone + '\'' +
                '}';
    }
}
