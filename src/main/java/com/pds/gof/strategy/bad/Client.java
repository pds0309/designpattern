package com.pds.gof.strategy.bad;

public class Client {
    public static void main(String[] args) {
        Monk monk = new Monk();
        monk.attack("손");
    }
}
