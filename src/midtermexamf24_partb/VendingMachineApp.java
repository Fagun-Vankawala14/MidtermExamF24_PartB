package midtermexamf24_partb;

import java.util.Scanner;

/**
 * Main class to run the Vending Machine application.
 * Demonstrates Cohesion by separating the setup and operations into a specific class.
 */
public class VendingMachineApp {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); 
        VendingMachine vendingMachine = new VendingMachine(); 
        vendingMachine.displayMenu(); 
        vendingMachine.selectItem(sc);
    }
}
