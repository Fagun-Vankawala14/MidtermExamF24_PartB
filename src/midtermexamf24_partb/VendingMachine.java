/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package midtermexamf24_partb;

/**
 *
 * @author jazzuu
 */
import java.util.Scanner;
//High Cohesion as class only responsible for vending machine operations display and select items
//Loose Coupling by sepearting classes for items in vending machine 

public class VendingMachine {
    private VendingMachineItem[] items; 
    private Scanner sc;
    //
    //In our main class we initialize the constructor for vending machine items
    public VendingMachine() 
    {
        items = new VendingMachineItem[] //flexible initailization
        {
            new VendingMachineItem("chocolate bar", 1.50, true),
            new VendingMachineItem("sour candy", 1.20, true), 
            new VendingMachineItem("soft drink", 1.80, true),
            new VendingMachineItem("potato chips", 2.00, true)
        };
        
        sc = new Scanner(System.in); //to get input from user
    }

    //We have method to display our vending machine menu
    
    public void displayMenu() {
        System.out.println("Welcome to the vending machine - Available Items:");
        for (int i = 0; i < items.length; i++) //loop to display items 
        {
            String availability;
            if(items[i].isItemAvailable())
            {
                availability = "Available";
            }
            
            else
            {
                    availability = "UnAvaiable";
            }
            System.out.println((i + 1) + ". " + items[i].getName() + "$" + items[i].getPrice() + " (" + availability + ")");
        }
    }

    //Method to selectItem from vending machine available options and 
    //also error handling if unavailable or selected another input
     // Method to handle item selection
    public void selectItem() {
        System.out.print("Please choose your option (1-4) ");
        int choice = sc.nextInt(); //to take user input

        if (choice >= 1 && choice <=4) 
        {
            VendingMachineItem selectedItem = items[choice -1]; 
            Selection(selectedItem); //calling selection method to display selected item and price 
        } 
        else 
        {
            System.out.println("Invalid selection. Please choose a valid number (1-" + items.length + ").");
        }
    }
    //single responsibility principle -- maintaining the code as each class has clear focus 
    //Method for Selection Item
    private void Selection(VendingMachineItem selectedItem) {
        
        if (selectedItem.isItemAvailable()) //If Item selected is available
        {
            System.out.println("Item Selected: " + selectedItem.getName());
            System.out.println("Price: $" + selectedItem.getPrice());
        } 
        else //If not in our inventory or unavailable
        {
            System.out.println("Sorry, the item is currently unavailable.");
        }
    }

    //main method to call displaymenu and selectitem methods
    //Abstraction -- manage items and selection hidden from user - User friendly interface
    public static void main(String[] args) {
        VendingMachine vending = new VendingMachine();  
        vending.displayMenu(); 
        vending.selectItem();   
    }
}
