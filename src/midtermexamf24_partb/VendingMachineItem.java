/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.

Name: Heet Chanchad
ID: 991740248


 */
package midtermexamf24_partb;

import java.util.Scanner;


// THis class only contains the data member definitions and making them private, this in turn encourages
// high coupling as the components relate to the VendingMachine entity.

public class VendingMachineItem {
    
    
//    Here, I added the enum type instead of the string array to have high cohesion and 
//    force it by the compiler so data from user is correct.
    public enum CandyType {
        chocolate_bar, sour_candy, soft_candy, potato_chips
    }

  
    
    public static double[] prices = {1.50, 1.20, 1.80, 2.00};
    public static boolean[] itemAvailability = {true, true, true, true}; // Initially all items are available
    
    private CandyType item;
    private double price;
    private boolean isAvailable;

    public VendingMachineItem() {
    }
    

    public VendingMachineItem(CandyType item, double price, boolean isAvailable) {
        this.item = item;
        this.price = price;
        this.isAvailable = isAvailable;
    }

    public CandyType getItem() {
        return item;
    }

    public void setItem(CandyType item) {
        this.item = item;
    }

    public boolean isIsAvailable() {
        return isAvailable;
    }

    public void setIsAvailable(boolean isAvailable) {
        this.isAvailable = isAvailable;
    }
    
    
    
    
    public double getPrice() {
        return price;
    }
    
    public void setPrice(double givenPrice) {
        price = givenPrice;
    }
    
//   Removed the main method and the functional methods and put them in a new class to have loose coupling, 
//    and the data being less dependent on each other among both classes
    
    
    
//    
    
}
