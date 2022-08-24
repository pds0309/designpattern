package com.pds.gof.abstractfactory.abstractfact;

import com.pds.gof.abstractfactory.obj.Player;
import com.pds.gof.abstractfactory.obj.Wizard;

public class WizardService implements PlayerService {

    private final PlayerEquipmentFactory equipmentFactory;

    public WizardService(PlayerEquipmentFactory equipmentFactory) {
        this.equipmentFactory = equipmentFactory;
    }

    @Override
    public Player makePlayer() {
        return new Wizard(equipmentFactory.createArmor(), equipmentFactory.createWeapon());
    }
}
