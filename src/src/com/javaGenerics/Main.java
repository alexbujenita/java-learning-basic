package com.javaGenerics;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
//        ArrayList items = new ArrayList();
//        items.add(1);
//        items.add(2);
//        items.add("Alex") <- we could do this, but at run time will error, casting string into integer
//        items.add(3);
//        items.add(4);
//        items.add(5);
//        printDoubled(items);
        ArrayList<Integer> items = new ArrayList<Integer>();
        items.add(1);
        items.add(2);
//        items.add("Alex");
        items.add(3);
        items.add(4);
        items.add(5);
        printDoubled(items);
    }

    private static void printDoubled(ArrayList<Integer> n) {
        for(int i : n) {
            System.out.println(i * 2);
        }
    }

//    private static void printDoubled(ArrayList n) {
//        for(Object i : n) {
//            System.out.println((Integer) i * 2);
//        }
//    }
}
