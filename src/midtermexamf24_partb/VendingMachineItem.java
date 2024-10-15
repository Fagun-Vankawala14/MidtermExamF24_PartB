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
        System.out.println("Welcome to the vending machine, here is a list of the items:");
        
        for (int i = 0; i < 4; i++) {
            System.out.println((i+1) + ". " + candies[i] + " - $" + prices[i]);
        
            if (!itemAvailability[i]) {
                System.out.println("Item is Unavailable.");
            } 
            else{
                System.out.println();
            }
        }
    }
    
    public static void selectItem() {
        
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Please select an item by entering the number (1-4): ");
        int choice = sc.nextInt();
        
        if (choice < 1 || choice > 4) {
            System.out.println("Invalid selection. Please choose a number between 1 and 4.");
            return;
        }
        
        int itemIndex = choice - 1; 

        if (!itemAvailability[itemIndex]) {
            System.out.println("Sorry, " + candies[itemIndex] + " is currently unavailable.");
        } else {
            System.out.println("You selected " + candies[itemIndex] + ". The price is $" + prices[itemIndex]);
            itemAvailability[itemIndex] = false;
        }
    }
    
    public static void main(String[] args) {
       
        displayMenu();
        selectItem();

      }
}
