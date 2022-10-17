package chapterTwo;

/** 2.15 **/

import java.util.ArrayList;

public class Invoice {
    public static class Item { // Открытый вложенный класс
        private String description;
        private int quantity;
        private double unitPrice;
        public Item(String description, int quantity, double unitPrice) {
            this.description = description;
            this.quantity = quantity;
            this.unitPrice = unitPrice;
        }
        public double price() { return quantity * unitPrice; }

        @Override
        public String toString(){
            return "Item{" +
                    "description=" + description +
                    ", quantity=" + quantity +
                    ", unitPrice=" + unitPrice +
                    '}';
        }
    }
    private ArrayList<Item> items = new ArrayList();
    public void add(Item item) { items.add(item); }
    public void showInvoice(){
    System.out.println("Счет-фактура");
        for(Item i: items){
            System.out.println(i.toString());
        }
    }
}


