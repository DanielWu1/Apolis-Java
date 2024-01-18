package com.java.day3;


import java.util.ArrayList;
import java.util.List;

class University {
    private String name;
    private List<Department> departments;

    public University(String name) {
        this.name = name;
        this.departments = new ArrayList<>();
    }

    public void addDepartment(Department department) {
        departments.add(department);
    }

    public List<Department> getDepartments() {
        return departments;
    }
}


class Department {
    private String name;

    public Department(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}
public class Aggregation {
    public static void main(String[] args) {
        University university = new University("Global University");
        university.addDepartment(new Department("Computer Science"));
        university.addDepartment(new Department("Mathematics"));

        for (Department dept : university.getDepartments()) {
            System.out.println("Department: " + dept.getName());
        }
    }
}
