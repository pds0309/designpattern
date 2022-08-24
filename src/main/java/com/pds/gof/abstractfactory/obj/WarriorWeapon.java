package com.pds.gof.abstractfactory.obj;

public class WarriorWeapon implements Weapon {
    @Override
    public void getInfo() {
        System.out.println("전사의 검");
    }

    public WarriorWeapon() {
        System.out.println("전사 검 착용");
    }
}
