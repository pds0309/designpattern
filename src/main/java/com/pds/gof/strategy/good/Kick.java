package com.pds.gof.strategy.good;

public class Kick implements AttackStrategy {
    @Override
    public void method() {
        System.out.println("발차기 공격");
    }
}
