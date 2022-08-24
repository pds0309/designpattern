package com.pds.gof.abstractfactory.abstractfact;

import com.pds.gof.abstractfactory.obj.*;

public class WizardEquipmentFactory implements PlayerEquipmentFactory {
    @Override
    public Armor createArmor() {
        return new WizardArmor();
    }

    @Override
    public Weapon createWeapon() {
        return new WizardWeapon();
    }
}
