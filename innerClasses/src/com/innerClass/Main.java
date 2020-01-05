package com.innerClass;

import java.util.Arrays;
import java.util.Scanner;

public class Main {

    private static Scanner scanner = new Scanner(System.in);
    private static Button btnPrint = new Button("Print");

    public static void main(String[] args) {
//        GearBox ferrari = new GearBox(6);
////        ferrari.addGear(1, 5.3);
////        ferrari.addGear(2, 10.6);
////        ferrari.addGear(3, 15.9);
//        ferrari.operateClutch(true);
//        ferrari.changeGear(1);
//        ferrari.operateClutch(false);
//        System.out.println(ferrari.wheelSpeed(1000));
//        ferrari.changeGear(2);
//        System.out.println(ferrari.wheelSpeed(3000));
//        ferrari.operateClutch(true);
//        ferrari.changeGear(3);
//        ferrari.operateClutch(false);
//        System.out.println(ferrari.wheelSpeed(6000));


//        class ClickListener implements Button.OnClickListener {
//            public ClickListener() {
//                System.out.println("I've been attached");
//            }
//
//            @Override
//            public void onClick(String title) {
//                System.out.println(title + " was clicked");
//            }
//        }
//        btnPrint.setOnClickListener(new ClickListener());

        // anonymous class below
        btnPrint.setOnClickListener(new Button.OnClickListener() {
            @Override
            public void onClick(String title) {
                System.out.println(title + " was clicked from anonymous class.");
            }
        });
        listen();
    }

    private static void listen() {
        boolean quit = false;
        while (!quit) {
            int choice = scanner.nextInt();
            scanner.nextLine();
            switch (choice) {
                case 0:
                    quit = true;
                    break;
                case 1:
                    btnPrint.onClick();
            }
        }
    }
}
