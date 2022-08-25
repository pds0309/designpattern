package com.pds.gof.bridge.bad;

public class SuperArmorBandit extends Bandit {
    @Override
    public void chat() {
        System.out.println("['슈퍼아머' 산적] 흐흐흐... 통행세를 내라!");
    }
}
