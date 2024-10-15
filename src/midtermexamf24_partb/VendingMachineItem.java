/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package midtermexamf24_partb;

import java.util.Scanner;

public class VendingMachineItem {
    public double price;
    
    public static String[] candies = {"chocolate bar", "sour candy", "soft drink", "potato chips", "Ice pops", "Tic Tac", "Gummies", "IceBreakers"};
    public static double[] prices = {1.50, 1.20, 1.80, 2.00, 5.00, 3.00, 4.25, 2.50};
    public static boolean[] itemAvailability = {true, true, true, true, true, true, true, true}; // Initially all items are available
    
    public VendingMachineItem() {
        // Constructor left blank intentionally
    }
    
    public double getPrice() {
        return price;
    }
    
    public void setPrice(double givenPrice) {
        price = givenPrice;
    }
    
    public boolean selectItem(int itemId) {
        if (isAvailable(itemId)) {
            // Proceed with selecting the item
            System.out.println("You selected: " + candies[itemId]);
            itemAvailability[itemId] = false;
            return true;
        } else {
            System.out.println("Item is not available.");
            return false;
        }
    }

    private boolean isAvailable(int itemId) {
        // Logic to check availability of the item (e.g., checking stock or status)
        return itemAvailability[itemId];
    }

    
    public static void displayMenu() {
        System.out.println("Welcome to the vending machine, here is a list of the possible candies:");
        for (int i = 0; i < candies.length; i++) {
            String availability = itemAvailability[i] ? "Available" : "Out of stock";
            System.out.println((i+1) + ". " + candies[i] + " - $" + prices[i] + " (" + availability + ")");
        }
    }
    
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        VendingMachineItem vendingMachine = new VendingMachineItem();
        
        while (true) {
            displayMenu();
            System.out.print("Select an item by number (1 to " + candies.length + ") or press 0 to exit: ");
            int selection = sc.nextInt() - 1;
            
            if (selection == -1) {
                System.out.println("Exiting...");
                break;
            }
            
            if (selection >= 0 && selection < candies.length) {
                vendingMachine.selectItem(selection); // Check item availability and select if possible
            } else {
                System.out.println("Invalid selection. Please choose a valid number.");
            }
            
        }
        
        sc.close();
    }
    
}
