package com.pds.gof.abstractfactory.obj;

public class Warrior extends Player {

    public Warrior(Armor armor, Weapon weapon) {
        super(armor, weapon);
        System.out.println("전사 생성");
    }

    @Override
    void attack() {
        System.out.println(getWeapon() + "으로 근접공격");
    }

}
