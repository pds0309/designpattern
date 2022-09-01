package com.pds.gof.strategy.good;


@FunctionalInterface
public interface AttackStrategy {

    AttackStrategy DEFAULT = () -> System.out.println("손날치기");

    void method();
}
