/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package midtermexamf24_partb;

import java.util.Scanner;

/**
 *
 * @author Jasleen kaur
 */

/**
 * I have used the Cohesion and loose coupling principles of OOP - JAVA
 * 1. Cohesion which is basically giving a single class a particular task as my vendingMachine is
 * dealing with requirements of vending machine such as showing the menu and
 * handling the selected item whereas my vending machine item class deals with
 * telling about the state of items.
 * 2/ Loose coupling is applied at when vending machine class with vendingMachineItem class
 * only through public methods (getters and setters) 
 */
public class VendingMachine {
    private VendingMachineItem[] items; 
   
    public VendingMachine() {
        items = new VendingMachineItem[]{
                new VendingMachineItem("chocolate bar", 1.50),
                new VendingMachineItem("sour candy", 1.20),
                new VendingMachineItem("soft drink", 1.80),
                new VendingMachineItem("potato chips", 2.00)
        };
    }

    
    public void displayMenu() {
        System.out.println("Welcome to the vending machine, here is a list of the available items:");
        for (int i = 0; i < items.length; i++) {
            System.out.println((i + 1) + ". " + items[i].getName() + " - $" + items[i].getPrice() +
                    (items[i].getItemAvailability() ? "" : " (Unavailable)")); 
        }
    }

    
    public void selectItem(int itemNumber) {
        if (itemNumber > 0 && itemNumber <= items.length) {
            VendingMachineItem selectedItem = items[itemNumber - 1];
            if (selectedItem.getItemAvailability()) {  
                System.out.println("You have selected: " + selectedItem.getName() + " for $" + selectedItem.getPrice());
                selectedItem.markUnavailable();
            } else {
                System.out.println("Sorry, " + selectedItem.getName() + " is currently unavailable.");
            }
        } else {
            System.out.println("Invalid choice. Please try again.");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        VendingMachine vendingMachine = new VendingMachine(); 
        vendingMachine.displayMenu(); 
        System.out.print("Please select an item by entering a number: ");
        int selectedItem = sc.nextInt();
        vendingMachine.selectItem(selectedItem);
        sc.close();
    }

}
