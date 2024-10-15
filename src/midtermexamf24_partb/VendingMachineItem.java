/*
   991744283_Palakpreet_Midterm(Branch Name)
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package midtermexamf24_partb;

import java.util.Scanner;

// Abstract class representing a general Vending Machine Item
abstract class Item {
    // All the fields are encapsulation
    private String name;
    private double price;
    private boolean isAvailable;

    // Item is initialised using this constructor
    public Item(String name, double price, boolean isAvailable) {
        this.name = name;
        this.price = price;
        this.isAvailable = isAvailable;
    }

    // An abstract method is implemented to get the details of particular item
    public abstract String getItemDetails();

    // Get method for accessing the private field
    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    public boolean isAvailable() {
        return isAvailable;
    }

    // Set method to update the value
    public void setAvailable(boolean available) {
        this.isAvailable = available;
    }
}


class Candy extends Item {

    public Candy(String name, double price, boolean isAvailable) {
        super(name, price, isAvailable);
    }

    // Implementing the abstract method
    @Override
    public String getItemDetails() {
        return getName() + " - $" + getPrice();
    }
}

class VendingMachine {
    private Item[] items;

    // Constructor to initialize the vending machine
    public VendingMachine() {
        items = new Item[] {
            new Candy("chocolate bar", 1.50, true),
            new Candy("sour candy", 1.20, true),
            new Candy("soft drink", 1.80, true),
            new Candy("potato chips", 2.00, true)
        };
    }

    // Display the menu of available items
    public void displayMenu() {
        System.out.println("Welcome to the vending machine, here is a list of the possible items:");
        for (int i = 0; i < items.length; i++) {
            String availability = items[i].isAvailable() ? "Available" : "Not Available";
            System.out.println((i + 1) + ". " + items[i].getItemDetails() + " (" + availability + ")");
        }
    }

    // Method to allow the user to select an item based on its availability
    public void selectItem() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter an item number that you would like to get: ");
        int choice = sc.nextInt() - 1;

        if (choice >= 0 && choice < items.length) {
            Item selectedItem = items[choice];

            if (selectedItem.isAvailable()) {
                System.out.println(selectedItem.getName() + " = $" + selectedItem.getPrice());
                selectedItem.setAvailable(false); // Update availability after purchase
             
            } else {
                System.out.println( selectedItem.getName() + " is not available.");
            }
        } else {
            System.out.println("Invalid selection.");
        }
    }

    public static void main(String[] args) {
        VendingMachine vendingMachine = new VendingMachine();
        vendingMachine.displayMenu();
        vendingMachine.selectItem();
    }
}


