//
// * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
// * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
// */
package midtermexamf24_partb;
//
// *
// * @author harpr
// *// Encapsulation principle is used by making all the fields private.Using getter
//and setter methods to access and modify the fields protecting the data from direct changes.
//Item class has their own responsibilities and it uses the principle of high cohesion and lose coupling
public class Item {
    private String name;  
    private double price;
    private boolean isAvailable;

    // Constructor
    public Item(String name, double price, boolean isAvailable) {
        this.name = name;
        this.price = price;
        this.isAvailable = isAvailable;
    }
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
        this.isAvailable = available;
    }
}

