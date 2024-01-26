package com.java.Reflection;

class Student {
    private String studentName;
    private String studentID;
    private String major;

    public Student() {
        super();
    }

    public Student(String studentName, String studentID) {
        super();
        this.studentName = studentName;
        this.studentID = studentID;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    public void setStudentID(String studentID) {
        this.studentID = studentID;
    }

    public void setMajor(String major) {
        this.major = major;
    }

    public String getStudentName() {
        return studentName;
    }

    public String getStudentID() {
        return studentID;
    }

    public String getMajor() {
        return major;
    }

    public String getInfo() {
        return "Student [studentName=" + studentName + ", studentID=" + studentID + ", major=" + major + "]";
    }
}
