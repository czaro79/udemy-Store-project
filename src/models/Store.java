package models;

import java.util.ArrayList;

public class Store {
    private ArrayList<Item> store;

    public Store() {
        this.store = new ArrayList<Item>();
    }

    public void addItem(Item item) {
        if (item.getClass() == Item.class) {
            this.store.add(new Item(item));
        } else if (item.getClass() == Milk.class) {
            this.store.add(new Milk((Milk) item));
            ;
        } else if (item.getClass() == Newspaper.class) {
            this.store.add(new Newspaper((Newspaper) item));
        } else {
            this.store.add(new Bread((Bread) item));
        }
    }

    public Item getItem(int index) {
        if (store.isEmpty()) {
            throw new IllegalArgumentException("Cannot get item from empty store.");
        }

        if (this.store.get(index).getClass() == Bread.class) {
            return new Bread((Bread) this.store.get(index));
        } else if (this.store.get(index).getClass() == Milk.class) {
            return new Milk((Milk) this.store.get(index));
        } else if (this.store.get(index).getClass() == Newspaper.class) {
            return new Newspaper((Newspaper) this.store.get(index));
        }

        return new Item(this.store.get(index));
    }

    public String toString() {
        StringBuilder temp = new StringBuilder();

        for (Item item : this.store
        ) {
            temp.append(item.toString()).append("\n");
        }

        return temp.toString();
    }

    public double[] showValueOfAllItemsInBuyingPSellingP() {
        if (store.isEmpty()) {
            throw new IllegalArgumentException("Cannot check the value of items in an empty store.");
        }

        double totalValueInSellingPrices = 0;
        double totalValueInBuyingPrices = 0;

        for (Item item : store
        ) {
            totalValueInBuyingPrices += item.getBuyingPrice() * item.getQuantity();
            totalValueInSellingPrices += item.getSellingPrice() * item.getQuantity();
        }
        return new double[]{totalValueInBuyingPrices, totalValueInSellingPrices};
    }

}
