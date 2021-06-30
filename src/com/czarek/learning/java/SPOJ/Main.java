package com.czarek.learning.java.SPOJ;

import models.*;


public class Main {

    public static void main(String[] args) {
        Newspaper newspaper = new Newspaper("Dziennik wschodni", "daily", 200);
        Bread bread = new Bread("Zaleszany", 123, true);
        Milk milk = new Milk("Mleczarnia Krasnystaw", 150, "bottle", false);
        Item item = new Item(900);

        Store store = new Store();
        store.addItem(newspaper);
        store.addItem(bread);
        store.addItem(milk);
        store.addItem(item);

        
    }
}
