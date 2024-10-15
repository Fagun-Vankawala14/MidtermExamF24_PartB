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
    
    public static void selectItem(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter the item number you want to buy:");
        int choice=sc.nextInt()-1;
        
        if (choice<0 || choice>candies.length) {
            System.out.println("Invalid!! Please enter the valid number");
        }
        
        else if (!itemAvailability[choice]) {
            System.out.println("Sorry!! "+ candies[choice] + " is not available.");
        }
        else {
            System.out.println(candies[choice]+ " is for $" + prices[choice]);
        }
    }
    
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        displayMenu();
        selectItem();
                

      }
}
