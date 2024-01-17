package com.java.oops.oops8;

class Club {
    String clubName;

    public void setClubName(String clubName) {
        this.clubName = clubName;
    }
}

public class Member {
    private String memberName;
    private int memberId;

    public void setMemberDetails(String name, int id) {
        this.memberName = name;
        this.memberId = id;
    }

    public void displayMemberInfo(Club club) {
        System.out.println("Club Name: " + club.clubName);
        System.out.println("Member Name: " + memberName);
        System.out.println("Member ID: " + memberId);
    }

    public static void main(String[] args) {
        Club club = new Club();
        club.setClubName("Chess Club");

        Member member = new Member();
        member.setMemberDetails("Alice", 123);
        member.displayMemberInfo(club);
    }
}
