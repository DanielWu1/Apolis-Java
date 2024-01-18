package com.java.oops.oops13;

class ConfigManager {
    private static String databaseUrl;

    static {
        // Static initialization block
        databaseUrl = "jdbc:mysql://localhost:3306/mydatabase";
        System.out.println("Static block initializing database URL");
    }

    public static String getDatabaseUrl() {
        return databaseUrl;
    }

}
public class staticBlock {
    public static void main(String[] args) {
        System.out.println("Database URL: " + ConfigManager.getDatabaseUrl());
    }
}
