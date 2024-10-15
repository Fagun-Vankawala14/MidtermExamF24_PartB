/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package midtermexamf24_partb;
import java.util.ArrayList;
import java.util.List;
/**
 *
 * @author harpr
 */
//Vneding machine class has their own responsibilities it handles item management and use interactions
//and it uses the principle of high cohesion and lose coupling
public class VendingMachine {
    /*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
private List<Item> items; // List to hold items
    public VendingMachine() {
        items = new ArrayList<>();
        initializeItems();
    }
    private void initializeItems() {
        String[] candies = {"chocolate bar", "sour candy", "soft drink", "potato chips"};
        double[] prices = {1.50, 1.20, 1.80, 2.00};
        boolean[] itemAvailability = {true, true, true, true};

        for (int i = 0; i < candies.length; i++) {
            items.add(new Item(candies[i], prices[i], itemAvailability[i]));
        }
    }
      public void displayMenu() {
        System.out.println("Welcome to the vending machine, here is a list of the possible candies:");
        for (int i = 0; i < items.size(); i++) {
            Item item = items.get(i);
            System.out.println((i + 1) + ". " + item.getName() + " - $" + item.getPrice());
        }
    }
    public double selectItem(int lineNumber) {
        if (lineNumber < 1 || lineNumber > items.size()) {
            System.out.println("Invalid choice. Choose a valid item number.");
            return -1;
        }
        Item selectedItem = items.get(lineNumber - 1);
        if (!selectedItem.isAvailable()) {
            System.out.println("Sorry, " + selectedItem.getName() + " is not available.");
            return -1;
        }
        System.out.println("You have selected " + selectedItem.getName());
        double price = selectedItem.getPrice();
        
        selectedItem.setAvailable(false); // Mark item as sold
        System.out.println("The price of your selected item is $" + price);
        return price;
    }
}


    
    
    



