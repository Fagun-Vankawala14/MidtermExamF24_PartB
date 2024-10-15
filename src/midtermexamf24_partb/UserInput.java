/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package midtermexamf24_partb;

import static midtermexamf24_partb.VendingMachineItem.itemAvailability;

/**
 *
 * @author preet
 */
//make separate class for user input so that it will increase cohesion within Vending machine class Item class Because in a class only functionallly related elements should be present
//It will also decrease coupling
public class UserInput {
    public static void selectItem(){
        System.out.println("Customer chose chocolate bar");
        String c="chocolate Bar";
        if(itemAvailability[0]==true)
                {
                    System.out.println("chocolate Bar is available. You can take it");
                }
                else{
                    System.out.println("Sorry, chocolate Bar is unavailable. You can not take it");
                } 
    
}
}