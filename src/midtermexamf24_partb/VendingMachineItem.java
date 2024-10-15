/*
991276249 Veronica Pereira
1:05
 */
package midtermexamf24_partb;

import java.util.Scanner;

public class VendingMachineItem {
    //OOP design = encapsulation, creating the candies, price and item 
    //as private to not have variables visible to everywhere.
    //with constructor created an object must have a name, price and avaliability 
    //to prevent mistakes with adding items to the machine
    
    private final double price;
    private final String name;
    private final boolean avail;
    
    //constructor 
    public VendingMachineItem(String name, double price, boolean avail) {
      this.name = name;
      this.price = price;
      this.avail = avail;
    }
    
    //OOP design: created high cohesion. 
    //One class responsible for creating objects of correct structure,
    //change to one item does not affect all of code
    static VendingMachineItem[] listOfItems;
    
    public static void addToVendingMachine(String name, double price, boolean avail){
       
        listOfItems = new VendingMachineItem[10];
        listOfItems[0] = new VendingMachineItem("Chocolate Bar", 1.50, true);
        listOfItems[1] = new VendingMachineItem("Sour Candy", 1.20, true);
        listOfItems[2] = new VendingMachineItem("Soft Drink", 1.80, true);
        listOfItems[3] = new VendingMachineItem("Potato Chips ", 2.00, true);
}
    public static void display(){
        for (int i = 0; i < 4; i++) {
             System.out.println((i+1)+". " +listOfItems[i].name + " $" + listOfItems[i].price);
            }
        
        }
//}
//    public double getPrice() {
//        return price;
//    }
//    public void setPrice(double price) {
//        price = this.price;
//    }
//    
//    public static void selectItem(){ //prints out list of items, checking if avaliable if not, sending message unavaliable
//      for (int i = 0; i < 4; i++) {
//          System.out.println((i+1) + ". " + listOfItems[i].display());
//        }
//      }
//    
//    
//    public static void displayMenu(VendingMachineItem) {
//          System.out.println("Welcome to the vending machine, here is a list of the possible candies:");
//    for (int i = 0; i < 4; i++) {
//        if (addToVendingMachine[i].avail == true){
//            System.out.println((i+1) + ". " + candies[i] + " - $" + prices[i]);}
//        else {
//        System.out.println((i+1) + ". " + candies[i] + " is not avaliable");
//        }
//    }
    
   
  
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
         display();

      }
}
