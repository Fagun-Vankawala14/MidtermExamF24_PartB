/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package midtermexamf24_partb;

import java.util.Scanner;
import static midtermexamf24_partb.VendingMachineItem.displayMenu;
import static midtermexamf24_partb.UserInput.selectItem;

/**
 *
 * @author preet
 */
public class VendingMachine {
    
    // We have made a separate class for main method for loose coupling and increase cohesion of VendingMachineItem class  because by making the separate class for
    //main method, now if user wants to use the code written in VendingMachineItem class but without running the main method in the below way he 
    //can easily do so because now both are in separate classes
     public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        displayMenu();
 
        selectItem();       

      }
    
}
