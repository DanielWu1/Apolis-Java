package com.java.Reflection;

import java.lang.reflect.Field;

public class Reflection5 {
    public static void main(String[] args) throws NoSuchFieldException, IllegalAccessException {
        Student student = new Student("John Doe", "123456789");

        Field studentNameField = student.getClass().getDeclaredField("studentName");
        studentNameField.setAccessible(true); // Make it accessible
        System.out.println("Original student name: " + studentNameField.get(student));

        studentNameField.set(student, "Jane Smith");
        System.out.println("Modified student name: " + studentNameField.get(student));

    }
}
