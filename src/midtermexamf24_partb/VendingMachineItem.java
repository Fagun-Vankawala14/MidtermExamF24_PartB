/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package midtermexamf24_partb;

public class VendingMachineItem {
    private double price;
    
    private static String[] candies = {"chocolate bar", "sour candy", "soft drink", "potato chips"};
    private static double[] prices = {1.50, 1.20, 1.80, 2.00};
    private static boolean[] itemAvailability = {true, true, true, true}; // Initially all items are available
    
    public VendingMachineItem() {
        
    }

    public static String[] getCandies() {
        return candies;
    }

    public static void setCandies(String[] candies) {
        VendingMachineItem.candies = candies;
    }

    public static double[] getPrices() {
        return prices;
    }

    public static void setPrices(double[] prices) {
        VendingMachineItem.prices = prices;
    }

    public static boolean[] getItemAvailability() {
        return itemAvailability;
    }

    public static void setItemAvailability(boolean[] itemAvailability) {
        VendingMachineItem.itemAvailability = itemAvailability;
    }
    
    public double getPrice() {
        return price;
    }
    
    public void setPrice(double givenPrice) {
        price = givenPrice;
    }
    
    public static void updateAvailability(int itemNumber) {
        if (itemNumber >= 1 && itemNumber <= 4) {
            itemAvailability[itemNumber - 1] = false;
        }
    }
}
