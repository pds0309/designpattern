package com.pds.gof.abstractfactory.abstractfact;

import com.pds.gof.abstractfactory.obj.Armor;
import com.pds.gof.abstractfactory.obj.WarriorArmor;
import com.pds.gof.abstractfactory.obj.WarriorWeapon;
import com.pds.gof.abstractfactory.obj.Weapon;

public class WarriorEquipmentFactory implements PlayerEquipmentFactory {
    @Override
    public Armor createArmor() {
        return new WarriorArmor();
    }

    @Override
    public Weapon createWeapon() {
        return new WarriorWeapon();
    }

}
