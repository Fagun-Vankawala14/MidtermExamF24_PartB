package midtermexamf24_partb;

import java.util.Scanner;

public class VendingMachine {

    public static void displayMenu() {
        System.out.println("Welcome to the vending machine, here is a list of the available candies:");
        for (VendingMachineItem.Candies candy : VendingMachineItem.Candies.values()) {
            System.out.println(candy.getName() + " - $" + candy.getPrice());
        }
    }

    public static String selectItem(String itemName) {
        for (VendingMachineItem.Candies candy : VendingMachineItem.Candies.values()) {
            if (candy.getName().equalsIgnoreCase(itemName)) {
                if (candy.isAvailable()) {
                    return candy.getName() + " is available at $" + candy.getPrice();
                } else {
                    return candy.getName() + " is not available";
                }
            }
        }
        return "Item not found.";
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        displayMenu();

        System.out.println("Please enter the item you would like to purchase: ");
        String selectedItem = scanner.nextLine();

        String result = selectItem(selectedItem);
        System.out.println(result);

        scanner.close();
    }
}
