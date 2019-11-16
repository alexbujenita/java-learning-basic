package com.linkedList;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;
import java.util.Scanner;

public class Demo {
    public static void main(String[] args) {
        LinkedList<String> placesToVisit = new LinkedList<String>();
        String[] cities = {"Venice", "Spalding", "Amsterdam", "Madrid"};
        String[] citiesDuplicate = {"Venice", "Spalding", "Amsterdam", "Madrid", "Bassano del Grappa"};
        addInOrder(placesToVisit, "Tokyo");

        printList(placesToVisit);

        for(int i = 0; i < cities.length; i++) {
            addInOrder(placesToVisit, cities[i]);
        }
        printList(placesToVisit);

        for(int i = 0; i < citiesDuplicate.length; i++) {
            addInOrder(placesToVisit, citiesDuplicate[i]);
        }
        printList(placesToVisit);

        visit(placesToVisit);
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

    private static void visit(LinkedList cities) {
        Scanner scanner = new Scanner(System.in);
        boolean quit = false;
        boolean goingForward = true;

        ListIterator<String> listIterator = cities.listIterator();

        if(cities.isEmpty()) {
            System.out.println("Empty list!");
            return;
        } else {
            System.out.println("Now visiting " + listIterator.next());
            printMenu();
        }

        while (!quit) {
            int action = scanner.nextInt();
            scanner.nextLine();

            switch (action) {
                case 0:
                    System.out.println("Holiday over... back to work :(");
                    quit = true;
                    break;

                case 1:
                    if (!goingForward) {
                        if (listIterator.hasNext()) {
                            listIterator.next();
                        }
                        goingForward = true;
                    }
                    if (listIterator.hasNext()) {
                        System.out.println("Moving to " + listIterator.next());
                    } else {
                        System.out.println("Seen everything");
                        goingForward = false;
                    }
                    break;

                case 2:
                    if (goingForward) {
                        if (listIterator.hasPrevious()) {
                            listIterator.previous();
                        }
                        goingForward = false;
                    }
                    if (listIterator.hasPrevious()) {
                        System.out.println("Now visiting " + listIterator.previous());
                    } else {
                        System.out.println("We are at the first city!");
                        goingForward = true;
                    }
                    break;

                case 3:
                    printMenu();
                    break;
            }
        }
    }
    private static void printMenu() {
        System.out.println("You can...\npress ");
        System.out.println("0 to quit\n" +
                "1 - Go to next city\n" +
                "2 - Go to the previous city\n" +
                "3 - Print this menu again");
    }
}
