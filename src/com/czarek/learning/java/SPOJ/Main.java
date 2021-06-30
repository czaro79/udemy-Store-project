package com.czarek.learning.java.SPOJ;

import models.*;

import java.util.Arrays;


public class Main {

    public static void main(String[] args) {
        Newspaper newspaper = new Newspaper("Dziennik wschodni", "daily", 1);
        Bread bread = new Bread("Zaleszany", 1, false);
        Milk milk = new Milk("Mleczarnia Krasnystaw", 1, "bottle", false);
        Item item = new Item(1);

        Store store = new Store();

        store.addItem(newspaper);
        store.addItem(bread);
        store.addItem(milk);
        store.addItem(item);
        System.out.println(Arrays.toString(store.showValueOfAllItemsInBuyingPSellingP())) ;

    }
}
