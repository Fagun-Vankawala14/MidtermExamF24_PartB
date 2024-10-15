/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template

Name: Heet Chanchad
ID: 991740248

 */
package midtermexamf24_partb;

import java.util.Scanner;
import static midtermexamf24_partb.VendingMachine.displayMenu;

/**
 *
 * @author heetc
 */


//to loosen the coupling, I am making this class to have the functionality in this class
//while the defintion of items in the VendingMachineItem class.

public class VendingMachine {
    
    VendingMachineItem item = new VendingMachineItem();
//    Here I created an object to use the methods of the VendingMachineItem class.
    
    
    
//    This is the same method but now it uses the enum to display the menu instead of string array.
    public static void displayMenu() {
        System.out.println("Welcome to the vending machine, here is a list of the possible candies:");
        for (int i = 0; i < 4; i++) {
            System.out.println((i+1) + ". " + VendingMachineItem.CandyType.values()[i] + " - $" + VendingMachineItem.prices[i]);
        }  
    }
    
    
    // Same thing here, this uses the private data members of the other class which is an example of encapsulation.
    public static void selectItem(int itemNo) {
        
        if(itemNo < 1 || itemNo > VendingMachineItem.CandyType.values().length){
            System.out.println("Choose a valid Item");
            return;
        }
        
        if(VendingMachineItem.itemAvailability[itemNo-1]){
            System.out.println("Your selection is: " + VendingMachineItem.CandyType.values()[itemNo-1] + ", Price = $" + VendingMachineItem.prices[itemNo-1]);
            VendingMachineItem.itemAvailability[itemNo-1] = false;
            System.out.println("THank you for the purchase!!");
        } else {
            System.out.println("Sorry, " + VendingMachineItem.itemAvailability[itemNo-1] + " is not Available!!");
        }
    }



//    Here is the main method where the item selection method is called which in turn uses the VendingMachineItem class 
//    containing the stored menu items, prices and accesses the private data members using the getter and setter methods
//    after creating an object for that item.
    
    
    
public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        displayMenu();
        
        System.out.print("Select any item:");
        
        int item = sc.nextInt();
                
        selectItem(item);

      }

}
    