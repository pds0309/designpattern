package com.pds.gof.abstractfactory.factory;

import com.pds.gof.abstractfactory.obj.WarriorWeapon;
import com.pds.gof.abstractfactory.obj.Weapon;

public class WarriorWeaponFactory implements WeaponFactory {
    @Override
    public Weapon createWeapon() {
        return new WarriorWeapon();
    }
}
