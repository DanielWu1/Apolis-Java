package com.java.oops.oops20;

class Restaurant {
    private String name;

    public Restaurant(String name) {
        this.name = name;
    }

    public void displaySpecialMenu() {
        class SpecialMenu {
            private String[] dishes;

            SpecialMenu(String[] dishes) {
                this.dishes = dishes;
            }

            public void displayMenu() {
                System.out.println("Special Menu for " + name + ":");
                for (String dish : dishes) {
                    System.out.println(dish);
                }
            }
        }

        String[] dishes = {"Grilled Salmon", "Caesar Salad", "Lemon Tart"};
        SpecialMenu menu = new SpecialMenu(dishes);
        menu.displayMenu();
    }
}
public class NestClass7FunctionClass {
    public static void main(String[] args) {
        Restaurant restaurant = new Restaurant("Cafe Java");
        restaurant.displaySpecialMenu();
    }
}
