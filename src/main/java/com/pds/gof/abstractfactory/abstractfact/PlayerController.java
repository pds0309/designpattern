package com.pds.gof.abstractfactory.abstractfact;

import com.pds.gof.abstractfactory.obj.Player;

public class PlayerController {

    private final SelectRole command;

    private PlayerController(String command) {
        this.command = SelectRole.valueOf(command);
    }

    public static PlayerController of(String command) {
        return new PlayerController(command);
    }

    public Player create() {
        return command.createPlayer();
    }

    enum SelectRole {
        WAR {
            @Override
            public Player createPlayer() {
                return new WarriorService(new WarriorEquipmentFactory()).makePlayer();
            }
        }, WIZ {
            @Override
            public Player createPlayer() {
                return new WizardService(new WizardEquipmentFactory()).makePlayer();
            }
        };

        public abstract Player createPlayer();
    }

}
