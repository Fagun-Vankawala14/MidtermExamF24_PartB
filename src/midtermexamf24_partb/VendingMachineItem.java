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
            if(itemAvailability[i]=true){
            System.out.println((i+1) + ". " + candies[i] + " - $" + prices[i]);
            }
            else{
            System.out.println(candies[i]+" : is not avaiable at the moment.");}
        }
        
    }
    public static void selectItem(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter your selection\n press 1 for Chocolate Bar\nPress 2 for Sour Candy\nPress 3 for Soft Drink\nPress 4 for Potato Chips");
        String input = scanner.nextLine();
        int Selection = Integer.parseInt(input);
        if(itemAvailability[Selection]=false){
        System.out.println("Your Selected Item Is Out Of Stock Please Try Again");
        selectItem();
        }
        else{
        System.out.println("Your Selected Item Is : "+candies[Selection]);
        }
        
    }
    
    
    
    public static void main(String[] args) {
        displayMenu();
        selectItem();
                

      }
}
