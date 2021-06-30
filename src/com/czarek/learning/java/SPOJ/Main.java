package com.czarek.learning.java.SPOJ;

import models.Bread;
import models.Item;
import models.Milk;

public class Main {

    public static void main(String[] args) {
        Bread bread = new Bread( "Zalesznay", 123, false);
        Item item = new Item(12);
        Milk milk = new Milk("Dairy", 1222, "BoX", false);

        milk.setLactoseFree(true);
        bread.setGlutenFree(true);
        System.out.println(item);
        System.out.println(milk);
        System.out.println(bread);

        Item[] table = new Item[]{item, milk, bread};

    }
}
