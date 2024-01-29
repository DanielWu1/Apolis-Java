package com.java.Collections.collection3;

import java.util.*;

public class StudentSortingExample {
    public static void main(String[] args) {

        Set<Student> set = new TreeSet<Student>(new StudentGradeComparator());
        set.add(new Student("Alice", 3.5));
        set.add(new Student("Bob", 3.9));
        set.add(new Student("Charlie", 3.5));
        set.add(new Student("David", 3.7));


        // Print sorted list
        for (Student student : set) {
            System.out.println(student);
        }
    }
}

