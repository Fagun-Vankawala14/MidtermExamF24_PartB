/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package midtermexamf24_partb;

//import java.util.Scanner;

public class VendingMachineItem {
    private String name;
    private double price;
    private boolean itemAvailability; 

 
    public VendingMachineItem(String name, double price) {
        this.name = name;
        this.price = price;
        this.itemAvailability = true; 
    }

    // Cohesion applied here as this method has only one responsibilty.
    public String getName() {
        return name;
    }

    // Cohesion applied here as this method has only one responsibilty.
    public double getPrice() {
        return price;
    }

    public boolean getItemAvailability() {
        return itemAvailability;
    }

    public void markUnavailable() {
        this.itemAvailability = false;
    }
}