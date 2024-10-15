/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package midtermexamf24_partb;

/**
 *
 * @author Bhumeek
 */
import java.util.Scanner;

public class VendingMachineDisplay {
    private VendingMachineItem[] items;

    public VendingMachineDisplay(VendingMachineItem[] items) {
        this.items = items;
    }

    public void displayMenu() {
        System.out.println("Welcome to the vending machine, here is a list of available items:");
        for (int i = 0; i < items.length; i++) {
            System.out.println((i + 1) + ". " + items[i].getName() + " - $" + items[i].getPrice()
                + " | Available: " + (items[i].isAvailable() ? "Yes" : "No"));
        }
    }

    public int getSelectedItem() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter the number of the item you want to select: ");
        return sc.nextInt() - 1;
    }
}
