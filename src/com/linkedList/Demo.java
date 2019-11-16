package com.linkedList;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;

public class Demo {
    public static void main(String[] args) {
        LinkedList<String> placesToVisit = new LinkedList<String>();
        String[] cities = {"Venice", "Spalding", "Amsterdam", "Madrid"};
        addInOrder(placesToVisit, "Tokyo");

        printList(placesToVisit);

        for(int i = 0; i < cities.length; i++) {
            addInOrder(placesToVisit, cities[i]);
        }
        printList(placesToVisit);

    }

    private static void printList(LinkedList<String> list) {
        Iterator<String> i = list.iterator();
        while (i.hasNext()) {
            System.out.println("Visiting " + i.next());
        }
        System.out.println("=============================");
    }

    private static boolean addInOrder(LinkedList<String> list, String item) {
        ListIterator<String> stringListIterator = list.listIterator();

        while(stringListIterator.hasNext()) {
            int comparison = stringListIterator.next().compareTo(item);
            if (comparison == 0) {
                System.out.println("Item already in list ---> " + item);
                return false;
            } else if (comparison > 0) {
                stringListIterator.previous();
                stringListIterator.add(item);
                return true;
            } else if (comparison < 0) {
                // will be the last item
            }
        }
        stringListIterator.add(item);
        return true;
    }
}
