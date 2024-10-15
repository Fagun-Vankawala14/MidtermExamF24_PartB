/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package midtermexamf24_partb;

import java.util.Scanner;

public class VendingMachineItem {
    public double price;
    
    public static String[] candies = {"chocolate bar", "sour candy", "soft drink", "potato chips"};
    public static double[] prices = {1.50, 1.20, 1.80, 2.00};
    public static boolean[] itemAvailability = {true, true, true, true}; // Initially all items are available
    
    public VendingMachineItem() {
        // Constructor left blank intentionally
    }

    
    public double getPrice() {
        return price;
    }
    
    public void setPrice(double givenPrice) {
        price = givenPrice;
    }
    
    public static void displayMenu() {
        System.out.println("Welcome to the vending machine, here is a list of the possible candies:");
        for (int i = 0; i < 4; i++) {
            System.out.println((i+1) + ". " + candies[i] + " - $" + prices[i]);
        }
    }
    
    public static void selectItem(int selection) {
        int userChoice = selection - 1; // Subtracting 1 for zero based index

        // Check if the userChoice is valid and if the item is available or not 
        if (userChoice >= 0 && userChoice < candies.length) {
            if (itemAvailability[userChoice]) {
                System.out.println("You selected: " + candies[userChoice] + " for $" + prices[userChoice]);
                // Marking the item as unavailable after selection of it 
                itemAvailability[userChoice] = false;
            } else {
                System.out.println("Sorry, " + candies[userChoice] + " is currently unavailable.");
            }
        } else {
            System.out.println("Invalid selection. Please try again.");
        }
    }
    
    
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        displayMenu();
        
        
        // Taking user input as an integer
        System.out.print("Please select an item by entering its number (1-4): ");
        int selection = sc.nextInt();
        
        // Calling the selectItem method to check availability of iteam  
        // And also to confirm the users selection
        selectItem(selection);
                

      }
}
