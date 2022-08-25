package com.pds.gof.bridge.bad;

public class Client {
    public static void main(String[] args) {
        Monster monster1 = new SuperArmorBandit();
        monster1.chat();
        Monster monster2 = new Orc();
        monster2.chat();
    }
}
