package com.czarek.learning.java.SPOJ;

import models.Bread;
import models.Item;
import models.Milk;
import models.Newspaper;

public class Main {

    public static void main(String[] args) {
        Newspaper newspaper = new Newspaper("Dziennik wschodni", "daily", 200);
        System.out.println(newspaper);

        newspaper.setTitleOfNewspaper("Kurier lubelski");
        newspaper.setTypeOfNewspaper("magAzine");
        newspaper.setQuantity(350);

        System.out.println(newspaper);

    }
}
