package main.java.ru.furiosaming.javacoretasks.chapter2;

/** 2.15 **/

import java.util.ArrayList;
import java.util.List;

public class Invoice {

    private List<Item> items = new ArrayList<>();

    public Invoice(){}

    public Invoice(List<Item> items){
        this.items = items;
    }

    public void add(Item item) {
        items.add(item);
    }

    public void showInvoice(){
        System.out.println("Счет-фактура");
        for(Item i: items){
            System.out.println(i.toString());
        }
    }

    @Override
    public String toString() {
        return "Invoice{" +
                "items=" + items +
                '}';
    }

    public static class Item { // Открытый вложенный класс

        private String description;
        private int quantity;
        private double unitPrice;

        public Item(){}

        public Item(String description, int quantity, double unitPrice) {
            this.description = description;
            this.quantity = quantity;
            this.unitPrice = unitPrice;
        }

        public String getDescription() {
            return description;
        }

        public int getQuantity() {
            return quantity;
        }

        public double getUnitPrice() {
            return unitPrice;
        }

        public void setDescription(String description) {
            this.description = description;
        }

        public void setQuantity(int quantity) {
            this.quantity = quantity;
        }

        public void setUnitPrice(double unitPrice) {
            this.unitPrice = unitPrice;
        }

        public double price() { return quantity * unitPrice; }

        @Override
        public String toString(){
            return "Item{" +
                    description +
                    ", quantity=" + quantity +
                    ", unitPrice=" + unitPrice +
                    '}';
        }
    }

}


