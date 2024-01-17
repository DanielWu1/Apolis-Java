package com.java.oops.oops4;

public class Person2 {
    static String firstName;
    String lastName;
    int age;

    static void changeFname(String name)
    {
        firstName = name;
    }

    void changeLname(String name)
    {
        this.lastName = name;
    }

    void change(String en,int sal, String name)
    {
        firstName = en;
        age = sal;
        lastName = name;
    }

    void displayResult() {
        System.out.println("first name - "+firstName);
        System.out.println("person details - \n name- "+lastName+"\nage- "+age+"\nlast name- "+lastName);
        System.out.println("------------------------------");
    }
    public static void main(String[] args) {

        Person2.changeFname("person Systems");
        Person2 person1 = new Person2();
        person1.change("Tim", 20, "tom");
        Person2 person2 = new Person2();
        person2.change("Jimmy", 30, "tom");
        person1.displayResult();
        person2.displayResult();
    }
}
