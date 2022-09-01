package com.pds.gof.strategy.bad;

public class Monk {

    public void attack(String method) {
        if ("발".equals(method)) {
            System.out.println("발차기 공격");
        } else if ("주먹".equals(method)) {
            System.out.println("주먹지르기 공격");
        } else {
            System.out.println("손날치기");
        }
    }
}
