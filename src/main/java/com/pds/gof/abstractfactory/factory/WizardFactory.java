package com.pds.gof.abstractfactory.factory;

import com.pds.gof.abstractfactory.obj.Armor;
import com.pds.gof.abstractfactory.obj.Player;
import com.pds.gof.abstractfactory.obj.Weapon;
import com.pds.gof.abstractfactory.obj.Wizard;

public class WizardFactory implements PlayerFactory {
    @Override
    public Player makePlayer(Weapon weapon, Armor armor) {
        return new Wizard(armor, weapon);
    }
}
