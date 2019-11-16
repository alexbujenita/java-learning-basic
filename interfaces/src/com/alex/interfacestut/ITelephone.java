package com.alex.interfacestut;

public interface ITelephone {
    // public is redundant
    public void powerOn();
    public void dial(int phoneNumber);
    public void answer();
    public boolean callPhone(int phoneNumber);
    public boolean isRinging();
}
