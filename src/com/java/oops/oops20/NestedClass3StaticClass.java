package com.java.oops.oops20;

class University {
    private String name;

    public University(String name) {
        this.name = name;
    }

    public void displayInfo() {
        System.out.println("University Name: " + name);
    }

    // Static nested class
    public static class Department {
        private String departmentName;
        private static int departmentCount = 0;

        public Department(String departmentName) {
            this.departmentName = departmentName;
            departmentCount++;
        }

        public void displayInfo() {
            System.out.println("Department Name: " + departmentName);
        }

        public static int getDepartmentCount() {
            return departmentCount;
        }
    }
}

public class NestedClass3StaticClass {
    public static void main(String[] args) {
        University university = new University("Harvard University");
        university.displayInfo();

        University.Department csDepartment = new University.Department("Computer Science");
        University.Department mathDepartment = new University.Department("Mathematics");

        csDepartment.displayInfo();
        mathDepartment.displayInfo();

        System.out.println("Total Departments: " + University.Department.getDepartmentCount());
    }
}
