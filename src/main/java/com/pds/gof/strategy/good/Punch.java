package com.pds.gof.strategy.good;

public class Punch implements AttackStrategy {
    @Override
    public void method() {
        System.out.println("주먹지르기");
    }
}
