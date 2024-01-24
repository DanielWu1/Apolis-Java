package com.java.oops.oops20;

class House {
    private String address;
    private static int houseCount = 0;

    public House(String address) {
        this.address = address;
        houseCount++;
    }

    public void displayInfo() {
        System.out.println("House Address: " + address);
    }

    // Instance nested class
    public class Room {
        private String roomName;

        public Room(String roomName) {
            this.roomName = roomName;
        }

        public void displayInfo() {
            System.out.println("Room: " + roomName + ", House Address: " + address + ", Total Houses: " + houseCount);
        }
    }

    public static int getHouseCount() {
        return houseCount;
    }
}
public class NestedClass4accessTest {
    public static void main(String[] args) {
        House myHouse = new House("123 Main St");
        House anotherHouse = new House("456 Elm St");

        House.Room livingRoom = myHouse.new Room("Living Room");
        House.Room kitchen = anotherHouse.new Room("Kitchen");

        myHouse.displayInfo();
        livingRoom.displayInfo();

        anotherHouse.displayInfo();
        kitchen.displayInfo();

        System.out.println("Total Houses: " + House.getHouseCount());
    }
}
