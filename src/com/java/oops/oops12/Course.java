package com.java.oops.oops12;

public class Course {
    private String title;
    private int durationInHours;

    {
        durationInHours = 5; // Initialize duration to a default value
        System.out.println(this); // This holds current object reference
        System.out.println("Duration initialized to default value: " + durationInHours);
    }

    public Course(String title, int durationInHours) {
        this.title = title;
        this.durationInHours = durationInHours;
    }

    public Course(String title) {
        this.title = title;
    }

    public String getTitle() {
        return title;
    }

    public int getDurationInHours() {
        return durationInHours;
    }

    public void displayCourseInfo() {
        System.out.println("Course Title: " + title);
        System.out.println("Duration in Hours: " + durationInHours);
    }

    public static void main(String[] args) {
        Course course1 = new Course("Java Programming", 30);
        Course course2 = new Course("Web Development");

        course1.displayCourseInfo();
        System.out.println(); // Adding a blank line for readability
        course2.displayCourseInfo();
    }
}

