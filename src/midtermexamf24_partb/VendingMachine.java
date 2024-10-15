package midtermexamf24_partb;

import java.util.Scanner;

/**
 * Handles the vending machine operations, such as displaying the menu and selecting items.
 * This class is designed with Cohesion in mind, focusing on the machine's functionality.
 */
public class VendingMachine {
    private VendingMachineItem[] items; // Encapsulated array of items in the vending machine

    // Constructor to initialize the vending machine with items
    public VendingMachine() {
        items = new VendingMachineItem[]{
            new VendingMachineItem("chocolate bar", 1.50, true),
            new VendingMachineItem("sour candy", 1.20, true),
            new VendingMachineItem("soft drink", 1.80, true),
            new VendingMachineItem("potato chips", 2.00, true)
        };
    }

    // Method to display the items in the vending machine
    public void displayMenu() {
        System.out.println("Welcome to the vending machine, here is a list of the possible items:");
        for (int i = 0; i < items.length; i++) {
            String availability = items[i].isAvailable() ? "Available" : "Out of Stock";
            System.out.println((i + 1) + ". " + items[i].getName() + " - $" + items[i].getPrice() + " (" + availability + ")");
        }
    }

    // Method to handle item selection, demonstrating Cohesion by focusing on machine logic
    public void selectItem(Scanner sc) {
        System.out.println("Please enter the number of the item you want to select:");
        int itemNumber = sc.nextInt();

        if (itemNumber < 1 || itemNumber > items.length) {
            System.out.println("Invalid Number. Try one more time!");
        } else {
            VendingMachineItem selectedItem = items[itemNumber - 1];
            if (selectedItem.isAvailable()) {
                System.out.println("You have selected: " + selectedItem.getName() + " - $" + selectedItem.getPrice());
                selectedItem.setAvailable(false); // Mark the item as out of stock after selection
                System.out.println("Thank you for shopping with us!");
            } else {
                System.out.println("Sorry, " + selectedItem.getName() + " is out of stock. Please select another item.");
            }
        }
    }
}
