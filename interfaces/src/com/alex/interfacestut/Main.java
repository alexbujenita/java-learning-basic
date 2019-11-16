package com.alex.interfacestut;

public class Main {
    public static void main(String[] args) {
        ITelephone myPhone;
        myPhone = new DeskPhone(908);
        myPhone.powerOn();
        myPhone.callPhone(908);
        myPhone.answer();

        System.out.println("-".repeat(30));

        myPhone = new MobilePhone(767);
        myPhone.powerOn();
        myPhone.callPhone(767);
        myPhone.answer();
    }
}
