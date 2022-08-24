package com.pds.gof.abstractfactory.factory;

import com.pds.gof.abstractfactory.obj.*;

public class WarrirorFactory implements PlayerFactory {
    @Override
    public Player makePlayer(Weapon weapon, Armor armor) {
        return new Warrior(armor, weapon);
    }
}
