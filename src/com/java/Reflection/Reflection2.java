package com.java.Reflection;

import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;

public class Reflection2 {
    public static void main(String[] args) {
        Class<Student> studentClass = Student.class;

        // Fetching fields metadata
        System.out.println("Fields of " + studentClass.getName() + ":");
        Field[] fields = studentClass.getDeclaredFields();
        for (Field field : fields) {
            System.out.println("Field Name: " + field.getName());
            System.out.println("Type: " + field.getType().getName());
            System.out.println("Modifiers: " + Modifier.toString(field.getModifiers()));
            System.out.println();
        }

    }
}
