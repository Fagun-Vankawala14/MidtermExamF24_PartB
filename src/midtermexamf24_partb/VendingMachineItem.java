/*  
 * To change this license header, choose License Headers in Project Properties.  
 * To change this template file, choose License Headers in Project Properties.  
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
    
    // Method to display the menu of candies  
    public static void displayMenu() {  
        System.out.println("Welcome to the vending machine, here is a list of the possible candies:");  
        for (int i = 0; i < candies.length; i++) {  
            System.out.println((i + 1) + ". " + candies[i] + " - $" + prices[i]);  
        }  
    }  
    
    // Method to select an item from the vending machine  
    public static void selectItem(Scanner sc) {  
        boolean validSelection = false; // Flag to check if a valid selection has been made  

        // Loop until a valid item is selected  
        while (!validSelection) {  
            System.out.print("Please select an item by entering the item number: ");  
            int selection = sc.nextInt() - 1; // Adjust for zero-based index  

            // Check if the selection is valid  
            if (selection < 0 || selection >= candies.length) {  
                System.out.println("Invalid selection. Please choose a valid item number.");  
                continue;  
            }  

            // Check if the selected item is available  
            if (itemAvailability[selection]) {  
                System.out.println("You have selected " + candies[selection] + " for $" + prices[selection]);  
                itemAvailability[selection] = false; // Mark the item as unavailable after selection  
                validSelection = true; // Exit the loop after a valid selection  
            } else {  
                System.out.println(candies[selection] + " is not available for selection. Please choose another item.");  
            }  
        }  
    }  
    
    // Main method to run the vending machine simulation  
    public static void main(String[] args) {  
        Scanner sc = new Scanner(System.in); // Scanner for user input  
        boolean continueShopping = true; // Flag to control the shopping loop  

        // Loop for the shopping process  
        while (continueShopping) {  
            displayMenu(); // Display the available candies  
            selectItem(sc); // Allow the user to select an item  

            // Ask if the user wants to buy another candy  
            System.out.print("Would you like to buy any other candy? (yes/no): ");  
            String response = sc.next().trim().toLowerCase();  
            if (response.equals("no")) {  
                continueShopping = false; // Exit the shopping loop  
                System.out.println("Thank you for your purchase! Have a great day!");  
            }  
        }  
        sc.close(); // Close the scanner  
    }  
}