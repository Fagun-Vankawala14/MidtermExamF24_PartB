/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package midtermexamf24_partb;

import java.util.Scanner;

public class VendingMachineItem {
    private double price; // Encapsulation: Price is private
    
    private String name; // Encapsulation: Name of the item is encapsulated
    private boolean isAvailable; // Encapsulation: Availability status is private

    // Constructor to initialize the item
    public VendingMachineItem(String name, double price) {
        this.name = name;
        this.price = price;
        this.isAvailable = true; // Initially all items are available
    }
    
    // Getters and setters for encapsulation
    public double getPrice() {
        return price;
    }

    public String getName() {
        return name;
    }

    public boolean isAvailable() {
        return isAvailable;
    }

    public void setAvailable(boolean available) {
        isAvailable = available;
    }
    
    // Method to display item information
    public void displayItemInfo(int index) {
        System.out.println((index + 1) + ". " + name + " - $" + price);
    }
    
    // Method to select an item
    public boolean selectItem() {
        if (isAvailable) {
            setAvailable(false); // Mark item as unavailable
            return true; // Indicate successful selection
        } 
        return false; // Indicate item is unavailable
    }

    public static void displayMenu(VendingMachineItem[] items) {
        System.out.println("Welcome to the vending machine, here is a list of the possible candies:");
        for (int i = 0; i < items.length; i++) {
            items[i].displayItemInfo(i);
        }
    }
    
    public static void main(String[] args) {
        VendingMachineItem[] items = {
            new VendingMachineItem("chocolate bar", 1.50),
            new VendingMachineItem("sour candy", 1.20),
            new VendingMachineItem("soft drink", 1.80),
            new VendingMachineItem("potato chips", 2.00)
        };
        
        Scanner sc = new Scanner(System.in);
        displayMenu(items);
        selectItem(items);
    }
    
    // Method to select an item from the vending machine
    public static void selectItem(VendingMachineItem[] items) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Please enter the number of the item you want to select: ");
        int itemNumber = sc.nextInt();

        if (itemNumber < 1 || itemNumber > items.length) {
            System.out.println("Invalid selection. Please try again.");
            return;
        }

        int index = itemNumber - 1; // Adjust for zero-based index

        if (items[index].selectItem()) { // Check if item can be selected
            System.out.println("You have selected: " + items[index].getName() + ". Please pay $" + items[index].getPrice());
        } else {
            System.out.println("Sorry, " + items[index].getName() + " is currently unavailable.");
        }
    }
    
}
