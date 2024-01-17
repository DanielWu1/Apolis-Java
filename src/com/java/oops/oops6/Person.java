package com.java.oops.oops6;

public class Person {
    private String firstName;
    private int age;

    public void changeData(String firstName,int age)
    {
        this.firstName=firstName;
        this.age=age;
    }

    public void changeData(String firstName)
    {
        this.firstName = firstName;
    }

    public void changeData(int age)
    {
        this.age= age;
    }

    public void displayData() {
        System.out.println(firstName);
        System.out.println(age);
    }

    public static void main(String[] args) {
        Person person = new Person();
        person.changeData(40);
        person.displayData();
    }
}
