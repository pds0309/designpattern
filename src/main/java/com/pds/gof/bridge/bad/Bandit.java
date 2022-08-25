package com.pds.gof.bridge.bad;

public class Bandit implements Monster {
    @Override
    public void chat() {
        System.out.println("[산적] 흐흐흐... 통행세를 내라!");
    }
}
