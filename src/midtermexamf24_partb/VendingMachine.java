/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package midtermexamf24_partb;

/**
 *
 * @author Bhumeek
 */

public class VendingMachine {
    public static void main(String[] args) {
        // Array of items
        VendingMachineItem[] items = {
            new VendingMachineItem("Chocolate Bar", 1.50),
            new VendingMachineItem("Sour Candy", 1.20),
            new VendingMachineItem("Soft Drink", 1.80),
            new VendingMachineItem("Potato Chips", 2.00)
        };

        // Display Object
        VendingMachineDisplay display = new VendingMachineDisplay(items);
        display.displayMenu();

        int selectedItemIndex = display.getSelectedItem();

        // Check item availability
        if (items[selectedItemIndex].isAvailable()) {
            System.out.println("You selected: " + items[selectedItemIndex].getName());
            // Mark the item as unavailable
            items[selectedItemIndex].setAvailability(false);
        } else {
            System.out.println("Sorry, the selected item is out of stock.");
        }
    }
}
