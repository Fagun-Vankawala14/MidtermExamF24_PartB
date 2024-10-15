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
    
    public static void selectItem(int itemNumber) {
        if (itemNumber < 1 || itemNumber > candies.length) {
            System.out.println("Invalid selection. Please choose a valid item.");
            return;
        }

        if (itemAvailability[itemNumber - 1]) {
            System.out.println("You have selected: " + candies[itemNumber - 1]);
            System.out.println("Price: $" + prices[itemNumber - 1]);

            itemAvailability[itemNumber - 1] = false;
        } else {
            System.out.println("Sorry, " + candies[itemNumber - 1] + " is sold out.");
        }
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        displayMenu();
        
        System.out.print("Please select an item by entering its number: ");
        int selectedItem = sc.nextInt();
        
        selectItem(selectedItem);
                

      }
}
