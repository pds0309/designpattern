package com.pds.gof.builder;

public class Client {
    public static void main(String[] args) {
        KimBabBuilder kimBabBuilder = new DefaultKimBabBuilder();
        KimBab kimBab1 = kimBabBuilder
                .base(true, true)
                .chamchi(true, true)
                .build();
        System.out.println(kimBab1.isHam());
    }
}
