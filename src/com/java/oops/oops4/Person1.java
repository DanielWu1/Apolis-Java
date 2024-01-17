package com.java.oops.oops4;

public class Person1 {
    static String FirstName;
    String LastName;
    int age;

    static void changeFirstName(String name)
    {
        FirstName = name;
    }

    void changeLastName(String name){
        this.LastName = name;
    }
    void change(String en,int ag)
    {
        LastName = en;
        age = ag;
    }

    public static void main(String[] args) {
        Person1.FirstName="Daniel";
        System.out.println("person name : "+Person1.FirstName);

        Person1 emp1 = new Person1();
        emp1.change("Tim", 20);
        Person1 emp2 = new Person1();
        emp2.change("Jimmy", 20);

        System.out.println("person1 details - \n name- "+emp1.LastName+"\nage- "+emp1.age);
        System.out.println("person2 details - \n name- "+emp2.LastName+"\nage- "+emp2.age);

    }
}
