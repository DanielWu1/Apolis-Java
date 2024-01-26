package com.java.Reflection;

import java.lang.reflect.Field;
import java.lang.reflect.Modifier;

public class Reflection3 {
    public static void main(String[] args) throws IllegalArgumentException, IllegalAccessException, NoSuchFieldException, SecurityException {
        Student person = new Student();
        Class obj = person.getClass();

        Field[] fields = obj.getDeclaredFields();
        for (Field field : fields) {
            System.out.println("field Name: " + field.getName());
            int modifier = field.getModifiers();
            System.out.println("Modifier: " + Modifier.toString(modifier));
            System.out.println("Data Types: " + field.getType());
            System.out.println(" ");
        }
        ;
    }

}
