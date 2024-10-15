/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package midtermexamf24_partb;

import java.util.Scanner;

/*
Cohesion: 
The enum encapsulates all relevant data for the items.
It provides methods to access the name, price, check availability, and set availability for the items. It enhances cohesion.
*/
public enum VendingMachineItem {    
    CHOCOLATE_BAR("Chocolate Bar", 1.50),
    SOUR_CANDY("Sour Candy", 1.20),
    SOFT_DRINK("Soft Drink", 1.80),
    POTATO_CHIPS("Potato Chips", 2.00); 
    
    private final String name;
    private final double price;
    private boolean available;
    
    // Constructor for the enum
    VendingMachineItem(String name, double price) {
        this.name = name;
        this.price = price;
        this.available = true; // Initially, all items are available
    }
    
    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    public boolean isAvailable() {
        return available;
    }

    public void setUnavailable() {
        this.available = false;
    }
}
