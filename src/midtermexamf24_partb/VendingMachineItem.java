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
    public static double selectItem(int lineNumber){
        if(lineNumber < 1 || lineNumber > candies.length){
          System.out.println("Invalid try.Choose a valid item number");
          return -1;
        }
        if(!itemAvailability [lineNumber-1]){
           System.out.println("Sorry " + candies[lineNumber -1] + "item is not availabile" );
            return -1;
        }
        System.out.println("You have selected " + candies [lineNumber - 1 ]);
        double price = prices[lineNumber -1];
        
        itemAvailability[lineNumber - 1] =false;
        System.out.println("The price of your selected item is $"+ price);
        return price;
    }
    
    
    public static void main(String[] args) {
        displayMenu();
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Please select one of the item from following(1-4): ");
        int item = sc.nextInt();
        selectItem(item);
                

      }
}
