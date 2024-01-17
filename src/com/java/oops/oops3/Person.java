package com.java.oops.oops3;

public class Person {
    static String FirstName;
    String LastName;
    int age;

    static void changeCname(String cn)
    {
        FirstName = cn;
    }

    public static void main(String[] args) {
        Person.FirstName="gg";
        System.out.println("first Name : "+Person.FirstName);
        System.out.println("Access directly first Name : "+FirstName);

        Person Person1 = new Person();
        Person1.changeCname("aa");
        Person Person2 = new Person();

        System.out.println("Person1 first name : "+Person1.FirstName);
        System.out.println("Person2 first name : "+Person2.FirstName);
    }
}
