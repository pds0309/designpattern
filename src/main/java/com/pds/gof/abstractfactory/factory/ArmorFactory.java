package com.pds.gof.abstractfactory.factory;

import com.pds.gof.abstractfactory.obj.Armor;
import com.pds.gof.abstractfactory.obj.WarriorArmor;
import com.pds.gof.abstractfactory.obj.WizardArmor;

public enum ArmorFactory {
    WAR {
        @Override
        public Armor create() {
            return new WarriorArmor();
        }
    }, WIZ {
        @Override
        public Armor create() {
            return new WizardArmor();
        }
    };
    public abstract Armor create();
}
