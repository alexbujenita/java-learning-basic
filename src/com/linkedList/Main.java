package com.linkedList;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        Customer customer = new Customer("Alex", 67.65);
        Customer anotherCustomer;
        anotherCustomer = customer;
        anotherCustomer.setBalance(666.66);

        System.out.println("Balance for customer " + customer.getName() + " is " + customer.getBalance());
//        will change the first one... it is a reference in memory to the same obj

        ArrayList<Integer> intList = new ArrayList<Integer>();
        intList.add(3);
        intList.add(31);
        intList.add(33);
        intList.add(2345);

        for(int i = 0; i < intList.size(); i++) {
            System.out.println(intList.get(i));
        }

        intList.add(1, 444);

        for(int i = 0; i < intList.size(); i++) {
            System.out.println(intList.get(i));
        }
    }
}
