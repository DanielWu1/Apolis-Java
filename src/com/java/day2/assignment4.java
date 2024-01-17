package com.java.day2;
import java.util.ArrayList;
import java.util.List;

class Employee {
    private String name;
    private double salary;

    public Employee(String name, double salary) {
        this.name = name;
        this.salary = salary;
    }

    public static void calculateNetSalary(List<Employee>employees) {
        for (Employee emp : employees) {
            double netSalary = emp.salary - (emp.salary * 0.10);
            System.out.println("Net Salary of " + emp.name + ": " + netSalary);
        }

    }

}
public class assignment4 {
    public static void main(String[] args) {
        List<Employee> employees = new ArrayList<>();
        employees.add(new Employee("Alice", 50000));
        employees.add(new Employee("Bob", 60000));
        employees.add(new Employee("Charlie", 70000));
        Employee.calculateNetSalary(employees);
    }
}
