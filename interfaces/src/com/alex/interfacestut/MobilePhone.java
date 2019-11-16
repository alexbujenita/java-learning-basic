package com.alex.interfacestut;

public class MobilePhone implements ITelephone {
    private int myNumber;
    private boolean isRinging;
    private boolean isOn = false;

    public MobilePhone(int phoneNumber) {
        myNumber = phoneNumber;
    }
    @Override
    public void powerOn() {
        isOn = true;
        System.out.println("Is ON");
    }

    @Override
    public void dial(int phoneNumber) {
        if (isOn) {
            System.out.println("Now ringing on Mobile " + phoneNumber);
        } else {
            System.out.println("Mobile is turned OFF");
        }
    }

    @Override
    public void answer() {
        if (isRinging) {
            System.out.println("Answering mobile...");
            isRinging = false;
        }
    }

    @Override
    public boolean callPhone(int phoneNumber) {
        if (phoneNumber == myNumber && isOn) {
            isRinging = true;
            System.out.println("ringRing mobile");
        } else {
            isRinging = false;
            System.out.println("Mobile is OFF");
        }
        return isRinging;
    }

    @Override
    public boolean isRinging() {
        return isRinging;
    }

}
