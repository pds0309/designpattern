package com.pds.gof.strategy.good;

public class Client {
    public static void main(String[] args) {
        Monk monk = new Monk();
        monk.attack(new Kick());
        monk.attack();

        monk.attack("KICK");
        monk.attack("NORMAL");
    }
}
