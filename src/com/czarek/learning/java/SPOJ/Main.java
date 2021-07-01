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


    }
}
