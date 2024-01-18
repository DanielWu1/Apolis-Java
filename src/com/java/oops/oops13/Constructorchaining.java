package com.java.oops.oops13;

class Restaurant {
    String name;

    Restaurant(String name) {
        this.name = name;
    }

    public Restaurant() {
        super();
    }
}

class RestaurantOrder extends Restaurant {
    private String mainDish;
    private String drink;
    private int tableNumber;

    public RestaurantOrder(String mainDish, String drink, int tableNumber) {
        this.mainDish = mainDish;
        this.drink = drink;
        this.tableNumber = tableNumber;
    }

    public RestaurantOrder(String mainDish, int tableNumber) {
        this(mainDish, "Water", tableNumber); // Default drink
    }

    public RestaurantOrder(int tableNumber) {
        super("The Great Diner");
        this.tableNumber = tableNumber;
    }

    public void printOrderDetails() {
        System.out.println("Restaurant name is - " + name);
        System.out.println("Main Dish is - " + mainDish);
        System.out.println("Drink is - " + drink);
        System.out.println("Table Number is - " + tableNumber);
    }

}
public class Constructorchaining {
    public static void main(String[] args) {
        RestaurantOrder order = new RestaurantOrder(5);
        order.printOrderDetails();
    }
}
