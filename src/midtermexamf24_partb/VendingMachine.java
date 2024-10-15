/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package midtermexamf24_partb;

/**
 *
 * @author LENOVO
 */

import java.util.*;
/*
Coupling: 
The VendingMachine class handles the operations of displaying the menu and selecting items. It reduces coupling.

*/

public class VendingMachine {
 
     // displayMenu() is used to display the menu with item availability
    public static void displayMenu() {
        System.out.println("Welcome to the vending machine, here is a list of available items:");
        for (VendingMachineItem item : VendingMachineItem.values()) {
            String availability = item.isAvailable() ? "Available" : "Sold out";
            System.out.printf("%s - $%.2f (%s)%n", item.getName(), item.getPrice(), availability);
        }
    }

    // To select an item based on availability
    public static void selectItem(int itemNumber) {
        if (itemNumber < 1 || itemNumber > VendingMachineItem.values().length) {
            System.out.println("Invalid selection. Please choose a valid item.");
            return;
        }

        VendingMachineItem selectedItem = VendingMachineItem.values()[itemNumber - 1]; //To get the selected item

        if (selectedItem.isAvailable()) {
            System.out.println("You have selected: " + selectedItem.getName());
            System.out.println("Price: $" + selectedItem.getPrice());
            selectedItem.setUnavailable(); // It marks the item as unavailable after selection
        } else {
            System.out.println("Sorry, " + selectedItem.getName() + " is sold out.");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        displayMenu(); // Displays the menu to the user
        
        System.out.print("Please select an item by entering its number: ");
        int selectedItem = sc.nextInt(); // Get user's choice

        selectItem(selectedItem); // Process the selection
    }
    
    
}
