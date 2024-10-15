package midtermexamf24_partb;

import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author khush
 */


// Class representing the vending machine
public class VendingMachine {
    
    // Loose Coupling: The VendingMachine class interacts with VendingMachineItem objects through their public methods, allowing changes in item implementation without affecting the vending machine logic.
    private VendingMachineItem[] items;

    public VendingMachine(VendingMachineItem[] items) {
        this.items = items;
    }

    public void displayMenu() {
        System.out.println("Welcome to the vending machine, here is a list of the possible items:");
        for (int i = 0; i < items.length; i++) {
            // Displaying item only if they are available
            if (items[i].isAvailable()) {
                System.out.println((i + 1) + ". " + items[i].getName() + " - $" + items[i].getPrice());
            }
        }
    }

    public void selectItem(int selection) {
        int userChoice = selection - 1;
        if (userChoice >= 0 && userChoice < items.length) {
            VendingMachineItem selectedItem = items[userChoice];
            if (selectedItem.isAvailable()) {
                System.out.println("You selected: " + selectedItem.getName() + " for $" + selectedItem.getPrice());
                // Mark the item as unavailable after selection
                selectedItem.setAvailable(false);
            } else {
                System.out.println("Sorry, " + selectedItem.getName() + " is currently unavailable.");
            }
        } else {
            System.out.println("Invalid selection. Please try again.");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Creating VendingMachineItem objects to represent each item in the vending machine
        VendingMachineItem[] items = {
            new VendingMachineItem("Chocolate Bar", 1.50),
            new VendingMachineItem("Sour Candy", 1.20),
            new VendingMachineItem("Soft Drink", 1.80),
            new VendingMachineItem("Potato Chips", 2.00)
        };

        VendingMachine vendingMachine = new VendingMachine(items);
        vendingMachine.displayMenu();
        
        

        System.out.print("Please select an item by entering its number: ");
        int selection = sc.nextInt(); // taking the input from user
        vendingMachine.selectItem(selection); // passing the tasken input and calling the selectionItem method
    }
}
