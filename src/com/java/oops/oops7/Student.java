package com.java.oops.oops7;

import java.util.ArrayList;
import java.util.List;

class School {
    String schoolName;
    List<Student> students = new ArrayList<>();

    public void setSchoolName(String schoolName) {
        this.schoolName = schoolName;
    }

    public void addStudent(Student student) {
        this.students.add(student);
    }

    public void listAllStudents() {
        System.out.println("All students in " + schoolName + ":");
        for (Student student : students) {
            System.out.println(student.getStudentName() + ", age: " + student.getAge());
        }
    }
}

public class Student extends School {

    private String studentName;
    private int age;

    public void setStudentData(String studentName, int age) {
        this.studentName = studentName;
        this.age = age;
    }

    public String getStudentName() {
        return studentName;
    }

    public int getAge() {
        return age;
    }

    public void displayStudentData() {
        System.out.println("School name is: " + schoolName);
        System.out.println("Student name is: " + studentName);
        System.out.println("Age is: " + age);
    }

    public static void main(String[] args) {
        School school = new School();
        school.setSchoolName("Greenwood High");

        Student student1 = new Student();
        student1.setStudentData("Alice", 15);
        school.addStudent(student1);

        Student student2 = new Student();
        student2.setStudentData("Bob", 16);
        school.addStudent(student2);

        student1.displayStudentData(); // Displaying data of the first student
        school.listAllStudents(); // Listing all students in the school
    }
}