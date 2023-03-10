package main.java.ru.furiosaming.javacoretasks.chapter4;

import java.util.Objects;

public class Item {
    private String description;
    private double price;

    public Item(String description, double price) {
        this.description = description;
        this.price = price;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Item)) return false;
        Item item = (Item) o;
        return Double.compare(price, price) == 0 &&
                Objects.equals(description, description);
    }

    @Override
    public int hashCode() {
        return Objects.hash(description, price);
    }
}
