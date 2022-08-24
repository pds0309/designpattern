package com.pds.gof.abstractfactory.obj;

public class Wizard extends Player {
    public Wizard(Armor armor, Weapon weapon) {
        super(armor, weapon);
        System.out.println("마법사 생성");
    }

    @Override
    void attack() {
        System.out.println(getWeapon() + "으로 원거리 공격");
    }
}
