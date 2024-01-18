package com.java.day3;

class Computer {
    private Processor processor;
    private Memory memory;

    public Computer() {
        this.processor = new Processor("Intel Core i7");
        this.memory = new Memory(16); // 16 GB
    }

    public void startComputer() {
        System.out.println("Starting Computer with " + processor.getName() + " and " + memory.getSize() + "GB Memory");
    }
}


class Processor {
    private String name;

    public Processor(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}


class Memory {
    private int size;

    public Memory(int size) {
        this.size = size;
    }

    public int getSize() {
        return size;
    }
}
public class Composition {
    public static void main(String[] args) {
        Computer computer = new Computer();
        computer.startComputer();
    }
}
