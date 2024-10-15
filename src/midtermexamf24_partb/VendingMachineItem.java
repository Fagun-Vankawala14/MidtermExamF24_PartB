/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package midtermexamf24_partb;

import java.util.Scanner;

public class VendingMachineItem {
    public double price;
    //This class is showing menu and availability of items in the menu by using the variables defined in the method
    //. without asking for a user input or generating any random values. It is just showing the items which user can purchase
    //this means all the methods are functionally related to each other. Therefore this class have high cohesion
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
    public static void Item(){
            System.out.println("Please choose the candies after checking its availability:");
            
            for (int i = 0; i < 4; i++) {
                if(itemAvailability[i]==true)
                {
                    System.out.println((i+1) + ". " + candies[i]+" is available");
                }
                else{
                    System.out.println("Sorry, " + candies[i]+" is not available");
                }
        }
    

}
}
