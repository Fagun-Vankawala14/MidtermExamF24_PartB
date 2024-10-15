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

    public String selectItem(String item) {
        for (int i = 0; i < candies.length; i++) {
            if (itemAvailability[i]==true) {
                return candies[i] + "is available and price is" + prices[i];
            }

        }
        return  "The item is not available";
    }
    
    public double getPrice() {
        return price;
    }
    
    public void setPrice(double givenPrice) {
        price = givenPrice;
    }
    
    public static void displayMenu() {
        Scanner scanner = new Scanner(System.in);
        VendingMachineItem v = new VendingMachineItem();
        System.out.println("Welcome to the vending machine, here is a list of the possible candies:");
        for (int i = 0; i < 4; i++) {
            System.out.println((i+1) + ". " + candies[i] + " - $" + prices[i]);
        }
        System.out.println("Please enter the item you would like to purchase: ");
        String item = scanner.nextLine();
        v.selectItem(item);

    }
    
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        displayMenu();
                

      }
}
