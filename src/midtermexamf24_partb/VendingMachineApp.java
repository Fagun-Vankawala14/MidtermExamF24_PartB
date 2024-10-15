/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package midtermexamf24_partb;
// @author harpr
import java.util.Scanner;
public class VendingMachineApp {
      public static void main(String[] args) {
        VendingMachine vendingMachine = new VendingMachine();
        vendingMachine.displayMenu();
        Scanner sc = new Scanner(System.in);
        System.out.println("Please select one of the item from following(1-4): ");
        int item = sc.nextInt();
        vendingMachine.selectItem(item);
                
    }
}
