/*
1. Cohesion: To achieve high cohesion, (a) created a separate class Item to store item data and methods (name, price availability, getters and setters) and (b) retained vending machine methods in this class
2. Coupling: To achieve loose coupling, limited the interactions between the existing classes to just necessary ones. Calls for Item class in this class is limited to addition, removal, and checking for availability.
 */
package midtermexamf24_partb;

import java.util.Scanner;
import java.util.ArrayList;

public class VendingMachineItem {
    private ArrayList<Item> items = new ArrayList<Item>();;
    
    public VendingMachineItem() {
        items.add(new Item("chocolate bar", 1.50, 1));
        items.add(new Item("sour candy", 1.20, 1));
        items.add(new Item("soft drink", 1.80, 1));
        items.add(new Item("potato chips", 2.00, 1));
    }
    
    public void addItem(String name, Double price, Integer quantity) {
        items.add(new Item(name, price, quantity));
    }
    
    public void removeItem(String name) {
        for (Item item : items) {
            if (name.equals(item.getName())) {
                items.remove(item);
            }
        }
    }
    
    public boolean checkAvailability(String name) {
        for (Item item : items) {
            if (name.equals(item.getName())) {
                return (item.getQuantity() > 0 ? true : false);
            }
        }
        return false;
    }
    
    public void displayMenu() {
        int count = 1;
        System.out.println("Welcome to the vending machine, here is a list of the possible candies:");
        for (Item item : items) {
            System.out.println(String.format("%d. %s - %s", count, item.getName(), item.getPrice()));
            count++;
        }
    }
    public void buyItem(String name) {
        for (Item item: items) {
            if (name.equals("no")) {
                System.out.println("No transaction performed.");
                break;
            }
            if (name.equals(item.getName())) {
                item.setQuantity(item.getQuantity() - 1);
                System.out.println("Item dispensed.");
            }
        }
    }
    
    
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        VendingMachineItem v = new VendingMachineItem();
        v.displayMenu();
        System.out.print("Check if an item is available: ");
        String item = in.nextLine();
        System.out.println(v.checkAvailability(item) ? "Item is available." : "Item is not available.");
        System.out.print("Buy something? Enter no to skip: ");
        String inp = in.nextLine();
        v.buyItem(inp);
        System.out.print("Check if an item is available: ");
        item = in.nextLine();
        System.out.println(v.checkAvailability(item) ? "Item is available." : "Item is not available.");
        
      }
}
