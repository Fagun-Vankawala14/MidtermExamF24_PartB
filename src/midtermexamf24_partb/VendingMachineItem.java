/*  
 * To change this license header, choose License Headers in Project Properties.  
 * To change this template file, choose License Headers in Project Properties.  
 * To change this template file, choose Tools | Templates  
 * and open the template in the editor.  
 */  
package midtermexamf24_partb;  

import java.util.Scanner;  

public class VendingMachineItem {  
    // ENCAPSULATION  
    // This variable holds the price of the item. It's private so it can't be changed directly from outside the class.  
    private double price;  

    // This variable holds the name of the item.  
    private String name;  
    
    // This variable shows if the item is available for purchase.  
    private boolean available;  

    // Constructor to create a new item with a name and price. The item is available when created.  
    public VendingMachineItem(String name, double price) {  
        this.name = name;  
        this.price = price;  
        this.available = true; // When a new item is created, it is available for selection.  
    }
    
    //Single Responsibility Principle:
    //Each method in the class has a single responsibility. For example, getPrice() only retrieves the 
    //price, setAvailable() only changes the availability, and displayMenu() only handles the display of items.
    //This makes the code easier to maintain and understand, as each 

    
    // Method to get the price of the item.  
    public double getPrice() {  
        return price;  
    }  

    // Method to set a new price for the item.  
    public void setPrice(double givenPrice) {  
        price = givenPrice;  
    }  

    // Method to get the name of the item.  
    public String getName() {  
        return name;  
    }  

    // Method to check if the item is available.  
    public boolean isAvailable() {  
        return available;   
    }  

    // Method to set the availability of the item.  
    public void setAvailable(boolean available) {  
        this.available = available;   
    }  

    // Method to display the menu of available candies.  
    public static void displayMenu(VendingMachineItem[] items) {  
        System.out.println("Welcome to the vending machine, here is a list of the possible candies:");  
        for (int i = 0; i < items.length; i++) {  
            if (items[i].isAvailable()) { // Only show items that are available.  
                System.out.println((i + 1) + ". " + items[i].getName() + " - $" + items[i].getPrice());  
            }  
        }  
    }  

    // Method to allow the user to select an item from the vending machine.  
    public static void selectItem(VendingMachineItem[] items, Scanner sc) {  
        boolean validSelection = false; // This flag checks if the user made a valid selection.  

        // Loop until the user selects a valid item.  
        while (!validSelection) {  
            System.out.print("Please select an item by entering the item number: ");  
            int selection = sc.nextInt() - 1; // Adjust for zero-based index (user sees 1, but we use 0).  

            // Check if the selection is valid.  
            if (selection < 0 || selection >= items.length) {  
                System.out.println("Invalid selection. Please choose a valid item number.");  
                continue;  
            }  

            // Check if the selected item is available.  
            if (items[selection].isAvailable()) {  
                System.out.println("You have selected " + items[selection].getName() + " for $" + items[selection].getPrice());  
                items[selection].setAvailable(false); // Mark the item as unavailable after selection.  
                validSelection = true; // Exit the loop after a valid selection.  
            } else {  
                System.out.println(items[selection].getName() + " is not available for selection. Please choose another item.");  
            }  
        }  
    }  

    // Main method to run the vending machine simulation.  
    public static void main(String[] args) {  
        Scanner sc = new Scanner(System.in); // Create a scanner to read user input.  
        boolean continueShopping = true; // This flag is made to ask users if they wish to continue shopping...  

        // Create an array of VendingMachineItem objects with names and prices.  
        // The array groups all vending machine items together, making it easy to manage, add, and display them.  
        VendingMachineItem[] items = {  
            new VendingMachineItem("chocolate bar", 1.50),  
            new VendingMachineItem("sour candy", 1.20),  
            new VendingMachineItem("soft drink", 1.80),  
            new VendingMachineItem("potato chips", 2.00)  
        };  

        // Loop for the shopping process.  
        while (continueShopping) {  
            displayMenu(items); // Show the available candies to the user.  
            selectItem(items, sc); // Let the user select an item.  

            // Ask if the user wants to buy another candy.  
            System.out.print("Would you like to buy any other candy? (yes/no): ");  
            String response = sc.next().trim().toLowerCase();  
            if (response.equals("no")) {  
                continueShopping = false; // Exit the shopping loop if the user says no.  
                System.out.println("Thank you for your purchase! Have a great day!");  
            }  
        }  
        sc.close(); // Close the scanner to free up resources.  
    }  
}