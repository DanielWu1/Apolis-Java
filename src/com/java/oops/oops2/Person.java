package com.java.oops.oops2;

public class Person {
    static String FristName;
    String LastName;
    int age;

    public static void main(String[] args) {

        Person.FristName="gg";
        System.out.println("first name is "+Person.FristName);
        Person Person1 = new Person();
        Person Person2 = new Person();
        Person1.LastName="Tom";
        Person2.age=20;
        System.out.println("Person1 name : "+Person1.LastName);
        System.out.println("Person1 salary : "+Person1.age);
        System.out.println("Person2 name : "+Person2.LastName);
        System.out.println("Person2 salary : "+Person2.age);
    }
}
