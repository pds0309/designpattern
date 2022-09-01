package com.pds.gof.strategy.good;

public enum AttackEnum implements AttackStrategy {
    KICK(() -> System.out.println("발차기")),
    PUNCH(() -> System.out.println("주먹지르기")),
    NORMAL(AttackStrategy.DEFAULT);
    private final AttackStrategy attackStrategy;

    AttackEnum(AttackStrategy attackStrategy) {
        this.attackStrategy = attackStrategy;
    }

    @Override
    public void method() {
        attackStrategy.method();
    }
}
