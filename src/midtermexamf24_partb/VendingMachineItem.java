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
    
    public static void selectItem(Scanner sc) {

        System.out.println("Please Enter the Number of item you want to purchase: ");
        int itemNum = sc.nextInt();

        if (itemNum < 1 || itemNum > 4) {
            System.out.println("Invalid Number!. Try one more time: ");
        } else {
            int index = itemNum - 1;
            if (itemAvailability[index]) {
                System.out.println("Your Item: " + candies[index] + " -> $" + prices[index]);
                itemAvailability[index] = false; 
                System.out.println("Thank you for shopping with us!");
            } else {
                System.out.println("Sorry, " + candies[index] + " is out of stock. Please select another item.");
            }
        }
    }

    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        displayMenu();
        selectItem(sc);
      }
}
