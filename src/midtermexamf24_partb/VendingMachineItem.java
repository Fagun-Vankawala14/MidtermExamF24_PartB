/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package midtermexamf24_partb;



public class VendingMachineItem {
    public enum Candies {
        CHOCOLATE_BAR("chocolate bar", 1.50, true),
        SOUR_CANDY("sour candy", 1.20, true),
        SOFT_DRINK("soft drink", 1.80, true),
        POTATO_CHIPS("potato chips", 2.00, true);

        private final String name;
        private final double price;
        private final boolean available;


        Candies(String name, double price, boolean available) {
            this.name = name;
            this.price = price;
            this.available = available;
        }

        // Getters para obtener los valores
        public String getName() {
            return name;
        }

        public double getPrice() {
            return price;
        }

        public boolean isAvailable() {
            return available;
        }
    }

    public VendingMachineItem() {

    }






}