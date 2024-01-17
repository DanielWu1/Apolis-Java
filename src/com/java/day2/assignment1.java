package com.java.day2;

class Animal {
    void eat() {
        System.out.println("Animal is eating");
    }
}

class Dog extends Animal {
    void bark() {
        System.out.println("Dog is barking");
    }
}

class Cat extends Animal {
    void talk(){
        System.out.println("cat is talking");
    }
}

class BabyDog extends Dog {
    void weep() {
        System.out.println("BabyDog is weeping");
    }
}
public class assignment1 {
    public static void main(String[] args) {
        BabyDog tes1 = new BabyDog();
        tes1.weep();
        tes1.bark();
    }
}
