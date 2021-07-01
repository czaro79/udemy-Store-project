package com.czarek.learning.java.SPOJ;

import models.*;

import java.io.FileNotFoundException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Store store = new Store();
        try {
            store.loadStore();
        } catch (FileNotFoundException e) {
            System.out.println(e.getMessage());
        }

        while (true) {
            System.out.println(store);
            showAllOptions();

            Scanner scan = new Scanner(System.in);


        }
    }


    public static void showAllOptions() {
        System.out.println("Dear customer, what would you like to buy, please select:");
        System.out.println("\t1 - cleaning items");
        System.out.println("\t2 - gluten-free bread");
        System.out.println("\t3 - bread");
        System.out.println("\t4 - lactose-free milk in a bottle");
        System.out.println("\t5 - lactose-free milk in a box");
        System.out.println("\t6 - milk in a bottle");
        System.out.println("\t7 - milk in a box");
        System.out.println("\t8 - daily newspaper");
        System.out.println("\t9 - weekly newspaper");
        System.out.println("\t10 - magazine");
        System.out.println("\t0 - QUIT\n");
        System.out.print("I chose: ");
    }
}
