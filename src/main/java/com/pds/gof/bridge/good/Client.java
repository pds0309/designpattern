package com.pds.gof.bridge.good;

import com.pds.gof.bridge.bad.Monster;

public class Client {
    private static final State state1 = new Quick();
    private static final State state2 = new SuperArmor();

    public static void main(String[] args) {
        Monster monster1 = new Bandit(state1);
        monster1.chat();
        Monster monster2 = new Orc(state2);
        monster2.chat();
        Monster monster3 = new Bandit();
        monster3.chat();
    }
}
