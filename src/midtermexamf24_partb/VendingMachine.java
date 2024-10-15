/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package midtermexamf24_partb;

import java.util.Scanner;
/**
 *
 * @author trnka
 */


//VendingMachine class has high cohesion because it only handles the vending machine logic such as displaying the menu and selecting items.

//As it interacts with VendingMachineItem with its public methods only so there is reduced coupling.

public class VendingMachine {

    private VendingMachineItem[] items;
    
// Constructor maintains high cohesion
    
    public VendingMachine() {
        items = new VendingMachineItem[]{
            new VendingMachineItem("Chocolate Bar", 1.50, true),
            new VendingMachineItem("Sour Candy", 1.20, true),
            new VendingMachineItem("Soft Drink", 1.80, true),
            new VendingMachineItem("Potato Chips", 2.00, true)
        };
    }
    
//displayMenu method is cohesive because it only deals with presenting the item details to the user.
    public void displayMenu() {
        System.out.println("Welcome to the vending machine, here is a list of the items:");
        
        for (int i = 0; i < items.length; i++) {
            System.out.println((i + 1) + ". " + items[i].getName() + " - $" + items[i].getPrice());
            if (!items[i].isAvailable()) {
                System.out.println("Item is Unavailable.");
            } else {
                System.out.println();
            }
        }
    }
    
//selectItem method is cohesive because it handles only the item selection logic.
//The interaction between both classes with getter and setter ensures reduced coupling
    
    public void selectItem() {
        
        Scanner sc = new Scanner(System.in);
        System.out.print("Please select an item by entering the number (1-4): ");
        int choice = sc.nextInt();

        if (choice < 1 || choice > 4) {
            System.out.println("Invalid selection. Please choose a number between 1 and 4.");
            return;
        }

        VendingMachineItem selectedItem = items[choice - 1];
        if (!selectedItem.isAvailable()) {
            System.out.println("Sorry, " + selectedItem.getName() + " is currently unavailable.");
        } else {
            System.out.println("You selected " + selectedItem.getName() + ". The price is $" + selectedItem.getPrice());
            selectedItem.setAvailable(false); 
        }
    }
    
    public static void main(String[] args) {
        VendingMachine vendingMachine = new VendingMachine();
        vendingMachine.displayMenu();
        vendingMachine.selectItem();
    }
}
