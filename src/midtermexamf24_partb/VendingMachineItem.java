package midtermexamf24_partb;

/**
 * This class follows the principle of Encapsulation by keeping its fields private.
 */
public class VendingMachineItem {
    // Encapsulated field, made private to protect the data
    private String name; 
    private double price; 
    private boolean isAvailable; 

    // Constructor to initialize the item attributes
    public VendingMachineItem(String name, double price, boolean isAvailable) {
        this.name = name;
        this.price = price;
        this.isAvailable = isAvailable;
    }

    // Getter and Setter method (Encapsulation)
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
