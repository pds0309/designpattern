package com.pds.gof.abstractfactory.obj;

public class WizardWeapon implements Weapon {
    @Override
    public void getInfo() {
        System.out.println("마법사의 지팡이");
    }

    public WizardWeapon() {
        System.out.println("마법사 지팡이 착용");
    }
}
