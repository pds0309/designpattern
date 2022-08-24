package com.pds.gof.abstractfactory.factory;

import com.pds.gof.abstractfactory.obj.Weapon;
import com.pds.gof.abstractfactory.obj.WizardWeapon;

public class WizardWeaponFactory implements WeaponFactory {
    @Override
    public Weapon createWeapon() {
        return new WizardWeapon();
    }
}
