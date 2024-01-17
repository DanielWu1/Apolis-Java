package com.java.oops.oops5;

public class Person {
    private String firstName;
    private int age;

    public void change(String firstName,int age)
    {
        this.firstName = firstName;
        this.age = age;
    }

    public void printPersonData()
    {
        System.out.println(firstName);
        System.out.println(age);
    }
    public static void main(String[] args) {
        Person person = new Person();
        person.change("Tom", 45);
        person.printPersonData();

    }
}
