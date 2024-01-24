package com.java.oops.oops20;

class MusicBand {
    private String bandName;

    public MusicBand(String bandName) {
        this.bandName = bandName;
    }

    public void displayInfo() {
        System.out.println("Band Name: " + bandName);
    }

    // Instance nested class
    public class Member {
        private String name;
        private String role;

        public Member(String name, String role) {
            this.name = name;
            this.role = role;
        }

//        Static declarations in inner classes are not supported at language level '8'
//        static void displayInfo1(){
//            System.out.println("Member Name: " + name + ", Role: " + role + ", Band: " + bandName);
//        }

        public void displayInfo() {
            System.out.println("Member Name: " + name + ", Role: " + role + ", Band: " + bandName);
        }
    }
}
public class NestClass5InstanceClassTest {
    public static void main(String[] args) {
        MusicBand band = new MusicBand("The JavaTones");
        band.displayInfo();

        MusicBand.Member leadSinger = band.new Member("Alice", "Lead Singer");
        MusicBand.Member guitarist = band.new Member("Bob", "Guitarist");

        leadSinger.displayInfo();
        guitarist.displayInfo();
    }
}
