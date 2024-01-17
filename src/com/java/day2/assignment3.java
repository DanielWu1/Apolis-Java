package com.java.day2;
import java.util.HashMap;
import java.util.Map;

class ShoppingCart {
    private Map<String, Double> items = new HashMap<>();

    public void addItem(String item, double price) {
        items.put(item, price);
    }

    public void removeItem(String item) {
        items.remove(item);
    }

    public double calculateTotalPrice() {
        double total = 0;
        for (double price : items.values()) {
            total += price;
        }
        return total;
    }
}
public class assignment3 {
    public static void main(String[] args) {
        ShoppingCart test1 = new ShoppingCart();
        System.out.println(test1.calculateTotalPrice());
        test1.addItem("daniel", 12);
        test1.addItem("tom", 11);
        System.out.println(test1.calculateTotalPrice());
        test1.removeItem("daniel");
        System.out.println(test1.calculateTotalPrice());
    }

}
