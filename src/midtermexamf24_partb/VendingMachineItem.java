/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package midtermexamf24_partb;

// VendingMachineItem class is highly cohesive because it focuses on representing an item in the vending machine. 
public class VendingMachineItem {
    
    private String name;
    private double price;
    private boolean available;

    // Constructor is cohesive because it directly initializes the item
    public VendingMachineItem(String name, double price, boolean available) {
        this.name = name;
        this.price = price;
        this.available = available;
    }

    // Getter and setter methods increase cohesion
    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public boolean isAvailable() {
        return available;
    }

    public void setAvailable(boolean available) {
        this.available = available;
    }
}
