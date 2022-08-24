package com.pds.gof.abstractfactory.factory;

import com.pds.gof.abstractfactory.obj.Armor;
import com.pds.gof.abstractfactory.obj.Player;
import com.pds.gof.abstractfactory.obj.Weapon;

public interface PlayerFactory {
    Player makePlayer(Weapon weapon, Armor armor);
}
