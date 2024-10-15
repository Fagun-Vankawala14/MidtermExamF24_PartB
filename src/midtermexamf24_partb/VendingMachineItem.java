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
            String available;
            if(itemAvailability[i]){
                available="Available";
            } else {
                available="Out of Stock";
            }
            System.out.println((i+1) + ". " + candies[i] + " - $" + prices[i] + " ("+available+").");
        }
    }
    
    public static void selectItem(int noOfItem){
        if(noOfItem<1 || noOfItem>4){
            System.out.println("Your selection is invalid. Please try again.");
        }
        
        if (itemAvailability[noOfItem - 1]) {
            System.out.println("You selected " + candies[noOfItem - 1] + ". Enjoy!");
            itemAvailability[noOfItem - 1] = false;
        } else {
            System.out.println("Sorry, " + candies[noOfItem - 1] + " is out of stock.");
        }
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number;
        do{
            displayMenu();
            System.out.println("If you want to exit, choose 5.");
            number = sc.nextInt();
            if(number==5){
                System.out.println("See you later. Bye!");
                break;
            }
            selectItem(number);
        } while(number!=5);
      }
}
