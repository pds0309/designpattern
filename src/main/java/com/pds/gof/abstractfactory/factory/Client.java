package com.pds.gof.abstractfactory.factory;

import com.pds.gof.abstractfactory.obj.Player;

public class Client {
    public static void main(String[] args) {
        WeaponFactory wizardWeaponFactory = new WizardWeaponFactory();
        WeaponFactory warriorWeaponFactory = new WarriorWeaponFactory();
        PlayerFactory wizardFactory = new WizardFactory();
        PlayerFactory warriorFactory = new WarrirorFactory();
        Player player1 = wizardFactory.makePlayer(wizardWeaponFactory.createWeapon(), ArmorFactory.WIZ.create());
        Player player2 = warriorFactory.makePlayer(warriorWeaponFactory.createWeapon(), ArmorFactory.WAR.create());
    }
}
