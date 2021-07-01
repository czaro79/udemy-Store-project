package models;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.Scanner;

public class Store {
    private ArrayList<Item> store;

    public Store() {
        this.store = new ArrayList<>();
    }

    private void addItem(Item item) throws IllegalArgumentException {
        //
    }

    public Item getItem(int index) throws IllegalArgumentException {
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

    public double[] getValueOfAllItemsInBuyingPSellingP() throws IllegalArgumentException {
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

    public void buyItem(String name) {

        //TODO

    }

    public void loadStore() throws FileNotFoundException, IllegalArgumentException {

        FileInputStream fis = new FileInputStream("src/files/warehouse.txt");
        Scanner scan = new Scanner(fis);

        while (scan.hasNextLine()) {
            String[] line = scan.nextLine().split(":");
            String name = line[0].toLowerCase();

            switch (name) {
                case "bread": {
                    this.store.add(new Bread(line[1], Integer.parseInt(line[2]), Boolean.parseBoolean(line[3])));
                    break;
                }
                case "milk": {
                    this.store.add(new Milk(line[1], Integer.parseInt(line[2]), line[3], Boolean.parseBoolean(line[4])));
                    break;
                }
                case "newspaper": {
                    this.store.add(new Newspaper(line[1], line[2], Integer.parseInt(line[3])));
                    break;
                }
                case "item": {
                    this.store.add(new Item(Integer.parseInt(line[1])));
                    break;
                }
                default: {
                    throw new IllegalArgumentException("LOAD OF DATA ERROR - NO SUCH ELEMENT!");
                }
            }
        }
        System.out.println("HAVE A NICE SHOPPING! NEW PRODUCTS DELIVERED.\n");
        scan.close();
    }

    public void showTheValueOfItems() {
        double[] storeValue = this.getValueOfAllItemsInBuyingPSellingP();

        DecimalFormat df = new DecimalFormat("0.00");
        System.out.println("Wartosc towaru w sklepie:");
        System.out.println("\t" + df.format(storeValue[0]) + " PLN w cenach zakupu");
        System.out.println("\t" + df.format(storeValue[1]) + " PLN w cenach sprzedaży");
    }
}
