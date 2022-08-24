package com.pds.gof.abstractfactory.abstractfact;

import com.pds.gof.abstractfactory.obj.Armor;
import com.pds.gof.abstractfactory.obj.Weapon;

public interface PlayerEquipmentFactory {
    Armor createArmor();

    Weapon createWeapon();
}
