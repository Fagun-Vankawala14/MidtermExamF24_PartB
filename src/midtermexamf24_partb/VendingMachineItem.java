/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package midtermexamf24_partb;


public class VendingMachineItem {
    //High Cohesion -- this class completely responsible for vending machine items
    //private attributes for encapsulation
    
    private String name;
    private double price;
    private boolean isItemAvailable;

  //constructor
    public VendingMachineItem(String name, double price, boolean isAvailable) {
        this.name = name;
        this.price = price;
        this.isItemAvailable = isAvailable;
    }

    //Getter and Setters for Price, Item name, and ItemAvailability
    
    //avoid direct dependencies 
    public String getName() {
        return name;
    }

    
    public double getPrice() {
        return price;
    }

    
    public boolean isItemAvailable() {
        return isItemAvailable;
    }

    
    public void setItemAvailable(boolean available) {
        this.isItemAvailable = available;
    }
}
