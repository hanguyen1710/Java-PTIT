package Thuong_mai_dien_tu;


import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int test = Integer.parseInt(sc.nextLine());
        while (test-- > 0) {
            Electronics electronics = new Electronics("laptop", 20, 10, "Dell");
            Book book = new Book("Harry Potter", 10, 12, "camnh");
            User user1 = new User("Alice");
            User user2 = new User("Bob");
            User user3 = new User("Charlie");
            user1.buyProduct(electronics, 3);
            user1.buyProduct(book, 10);
            user2.buyProduct(electronics, 1);
            user3.buyProduct(book, 5);
            System.out.println("====");
            System.out.println("Users with Highest Total Spent:");
            System.out.println("1. " + user1.getUsername() + ": $" + user1.getTotalSpent());
            System.out.println("2. " + user2.getUsername() + ": $" + user2.getTotalSpent());
            System.out.println("3. " + user3.getUsername() + ": $" + user3.getTotalSpent());
            System.out.println("====");
            electronics.displayDetails();
            System.out.println("---");
            book.displayDetails();
        }
    }
}

abstract class Product {
    protected String name;
    protected double price;
    protected int quantity;

    abstract double calculateCost(int quantity);

    abstract void displayDetails();

    public Product(String name, double price, int quantity) {
        this.name = name;
        this.price = price;
        this.quantity = quantity;
    }
}

class Book extends Product {
    private String author;

    public Book(String name, double price, int quantity, String author) {
        super(name, price, quantity);
        this.author = author;
    }

    @Override
    public double calculateCost(int quantity) {
        return price * quantity;
    }

    @Override
    public void displayDetails() {
        System.out.println("Name: " + name + "\n" + "Price: $" + price + "\n" + "Available Quantity: " + quantity + "\n" + "Author: " + author);
    }
}

class Electronics extends Product {
    private String brand;

    public Electronics(String name, double price, int quantity, String brand) {
        super(name, price, quantity);
        this.brand = brand;
    }

    @Override
    public double calculateCost(int quantity) {
        return price * quantity * 1.1;
    }

    @Override
    public void displayDetails() {
        System.out.println("Name: " + name + "\n" + "Price: $" + price + "\n" + "Available Quantity: " + quantity + "\n" + "Brand: " + brand);
    }
}

class User {
    private String username;
    private double totalSpent;

    public User(String username) {
        this.username = username;
    }

    public String getUsername() {
        return username;
    }

    public double getTotalSpent() {
        return totalSpent;
    }

    public void buyProduct(Product product, int quality) {
        if (quality <= product.quantity) {
            System.out.println("User: " + username + " bought " + quality + " " + product.name + " for $" + product.calculateCost(quality));
            product.quantity -= quality;
            totalSpent += product.calculateCost(quality);
        } else {
            System.out.println("Insufficient quantity of " + product.name + " available.");
        }
    }

}