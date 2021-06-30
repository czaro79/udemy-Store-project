package com.czarek.learning.java.SPOJ;

import models.*;

import java.io.FileNotFoundException;
import java.text.DecimalFormat;
import java.util.Arrays;


public class Main {

    public static void main(String[] args) {

        Store store = new Store();

        try {
            store.loadStore();
        } catch (FileNotFoundException e) {
            System.out.println(e.getMessage());
        }

        double[] storeValue = store.showValueOfAllItemsInBuyingPSellingP();
        System.out.println(store);


        DecimalFormat df= new DecimalFormat("0.00");
        System.out.println("Wartosc towaru w sklepie:");
        System.out.println("\tW cenach zakupu: " + df.format(storeValue[0]) + " PLN");
        System.out.println("\tW cenach sprzedaży: " + df.format(storeValue[1]) + " PLN");

    }
}
