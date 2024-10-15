/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package midtermexamf24_partb;



public class VendingMachineItem {
    // High Cohesion: This class has a only single responsibility - managing the properties and behavior of a vending machine item.
    

    private String name;
    private double price;
    private boolean isAvailable;

    public VendingMachineItem(String name, double price) {
        this.name = name;
        this.price = price;
        this.isAvailable = true; // all items are available by default (initially)
        
        
    }
    // removed the predefined arrays and adding the iteams afterwards

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    public boolean isAvailable() {
        return isAvailable;
    }
    
    

    public void setAvailable(boolean available) {
        isAvailable = available;
    }
}

    
