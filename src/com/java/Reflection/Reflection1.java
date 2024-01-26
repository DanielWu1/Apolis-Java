package com.java.Reflection;

import java.lang.reflect.Method;
import java.lang.reflect.Modifier;

public class Reflection1 {
    public static void main(String[] args) {
        Class<Student> studentClass = Student.class;

        // Fetching methods metadata
        Method[] methods = studentClass.getDeclaredMethods();
        System.out.println("Methods of " + studentClass.getName() + ":");
        for (Method method : methods) {
            System.out.println("Method Name: " + method.getName());
            System.out.println("Return Type: " + method.getReturnType().getName());
            System.out.println("Modifiers: " + Modifier.toString(method.getModifiers()));

            Class<?>[] parameterTypes = method.getParameterTypes();
            System.out.print("Parameters: ");
            for (Class<?> paramType : parameterTypes) {
                System.out.print(paramType.getName() + " ");
            }
            System.out.println("\n");
        }
    }
}
