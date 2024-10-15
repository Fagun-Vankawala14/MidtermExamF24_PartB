/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package midtermexamf24_partb;

import java.util.Scanner;

public class VendingMachineItem {
    private static String[] candies = {"chocolate bar", "sour candy", "soft drink", "potato chips"};
    private static double[] prices = {1.50, 1.20, 1.80, 2.00};
    private static boolean[] itemAvailability = {true, true, true, true}; // Initially all items are available

    public VendingMachineItem() {
        // Constructor left blank intentionally
    }
    
    public static void displayMenu() {
        System.out.println("Welcome to the vending machine. Here is a list of the possible candies:");
        for (int i = 0; i < candies.length; i++) {
            if (itemAvailability[i]) {
                System.out.println((i + 1) + ". " + candies[i] + " - $" + prices[i]);
            } else {
                System.out.println(candies[i] + " is not available at the moment.");
            }
        }
    }

    
    public static int selectItem() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter your selection:\n1. Chocolate Bar\n2. Sour Candy\n3. Soft Drink\n4. Potato Chips");
        
        int selection = -1; // Default invalid selection
        try {
            selection = Integer.parseInt(scanner.nextLine()) - 1; // Adjusting to 0-based index
        } catch (NumberFormatException e) {
            System.out.println("Invalid input! Please enter a number.");
        }

        
        if (selection < 0 || selection >= candies.length) {
            System.out.println("Invalid selection! Please try again.");
            return selectItem(); // Recursion to allow re-selection
        }

        return selection; // Return the valid selection index
    }

    
    public static String checkAvailability(int selection) {
        if (!itemAvailability[selection]) {
            return "Your selected item is out of stock. Please try again.";
        } else {
            return "Your selected item is: " + candies[selection];
        }
    }

    public static void main(String[] args) {
        displayMenu();
        int selectedItem = selectItem(); 
        String message = checkAvailability(selectedItem); 
        System.out.println(message);
    }
}
//How i used 2 oo principles here
//Cohesion :  I terms of cohesion i had high cohesion. I divided methods into several new methods such that each methods focuses on only 1 task thus the code becomes mpre understandable and easy to debug. For example checkAvaialblity one of the new methods that i made because earlier checkavailability was being done in only one method which becomes harder to debug thus i made a complete new method that will be called whenever i need it.
//Coupling : In terms of coupling i kept the methods loosely coupled or almost independent of each none of the method is dependent on each other such that the program may fail. Thus all the methods in this are loosely couple, they are almost independant of each other each method can be modified independantly for example if the logic for checking availability changes, it won’t affect the selectItem() method directly.