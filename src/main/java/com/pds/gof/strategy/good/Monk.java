package com.pds.gof.strategy.good;

public class Monk {

    public void attack(AttackStrategy attackStrategy) {
        attackStrategy.method();
    }

    public void attack() {
        AttackStrategy.DEFAULT.method();
    }

    public void attack(String attack) {
        AttackEnum.valueOf(attack).method();
    }
}
