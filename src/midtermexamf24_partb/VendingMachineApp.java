/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package midtermexamf24_partb;

/**
 *
 * @author xiprathakkar
 */
import java.util.Scanner;

public class VendingMachineApp {

    public static void displayMenu() {
        String[] candies = VendingMachineItem.getCandies();
        double[] prices = VendingMachineItem.getPrices();
        boolean[] availability = VendingMachineItem.getItemAvailability();

        System.out.println("Welcome to the vending machine, here is a list of the possible candies:");
        for (int i = 0; i < candies.length; i++) {
            String availabilityStatus = availability[i] ? "Available" : "Out of Stock";
            System.out.println((i + 1) + ". " + candies[i] + " - $" + prices[i] + " (" + availabilityStatus + ")");
        }
        System.out.println("5. Exit");
    }

    public static void selectItem(int itemNumber) {
        if (itemNumber < 1 || itemNumber > 4) {
            System.out.println("Invalid selection. Please choose a valid item number.");
        } else {
            boolean[] availability = VendingMachineItem.getItemAvailability();
            String[] candies = VendingMachineItem.getCandies();

            if (availability[itemNumber - 1]) {
                System.out.println("You selected " + candies[itemNumber - 1] + ". Enjoy!");
                VendingMachineItem.updateAvailability(itemNumber);
            } else {
                System.out.println("Sorry, " + candies[itemNumber - 1] + " is out of stock.");
            }
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int choice;

        do {
            displayMenu();
            choice = sc.nextInt();

            if (choice == 5) {
                System.out.println("Thank you for using the vending machine. Goodbye!");
                break;
            }

            selectItem(choice);
        } while (choice != 5);

        sc.close();
    }
}
