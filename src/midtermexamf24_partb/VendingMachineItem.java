/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package midtermexamf24_partb;

import java.util.Scanner;

public class VendingMachineItem {
    public double price;    // Made this private to follow encapsulation
    
    // The field price is made private, which hides it from direct access by other classes. 
    // Why: Encapsulation ensures that the internal state of an object is protected and can only be modified in a controlled way, following the principle of "information hiding."
    
    public static String[] candies = {"chocolate bar", "sour candy", "soft drink", "potato chips"};
    public static double[] prices = {1.50, 1.20, 1.80, 2.00};
    public static boolean[] itemAvailability = {true, true, true, true}; // Initially all items are available
    
    public VendingMachineItem() {
        // Constructor left blank intentionally
    }
    
    // Encapsulation - Use getter and setter for 'price'
    // getPrice() and setPrice() methods to control how this value is accessed and modified.
    // Cohesion: This method handles a specific task of getting the price, improving the class' cohesiveness.
    public double getPrice() {
        return price;
    }
    
    // Cohesion: This setter is specifically for setting the price of an item. 
    public void setPrice(double givenPrice) {
        price = givenPrice;
    }
    
    // High Cohesion: The method focuses only on displaying the menu (not on selection or buying logic).
    public static void displayMenu() {
        System.out.println("Welcome to the vending machine, here is a list of the possible candies:");
        for (int i = 0; i < 4; i++) {
            System.out.println((i+1) + ". " + candies[i] + " - $" + prices[i]);
        }
    }
    
    // High Cohesion: The selectItem method only handles item selection and availability checks, 
    // keeping responsibilities clear and concise
    public static void selectItem() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of the item you want to select: ");
        int itemNumber = sc.nextInt();
        
        if (itemNumber < 1 || itemNumber > candies.length) {
            System.out.println("Invalid selection. Please select a valid item.");
        } else if (!itemAvailability[itemNumber - 1]) {
            System.out.println("Sorry, the selected item is out of stock.");
        } else {
            System.out.println("You have selected: " + candies[itemNumber - 1] + " for $" + prices[itemNumber - 1]);
            itemAvailability[itemNumber - 1] = false; 
        }
    }
    
    public static void main(String[] args) {
        // High Cohesion: Each method performs its specific task: displayMenu() only displays the menu,
        // selectItem() only handles the selection process.
        
        Scanner sc = new Scanner(System.in);
        displayMenu();
        selectItem();
      }
}

/* 
Cohesion:
In the code, each method has a specific responsibility. This makes the class more cohesive, meaning that the VendingMachineItem class is focused on
managing vending machine-related actions (like showing items, selecting them, etc.). For example, displayMenu() only shows the menu, while selectItem()
deals only with the item selection and availability checking. This leads to high cohesion, which makes the code more readable and maintainable.

Coupling:
There is low coupling in the code because the methods and fields are not heavily dependent on external classes or components. For instance, selectItem()
does not rely on another class to perform its operation. Low coupling ensures that changes in one class will not significantly affect others, making the 
codebase more modular and flexible.
*/