package com.pds.gof.abstractfactory.abstractfact;

import com.pds.gof.abstractfactory.obj.Player;
import com.pds.gof.abstractfactory.obj.Warrior;

public class WarriorService implements PlayerService {

    // 클라이언트에서 주입하는 상태에 따라 플레이어의 장비셋을 갈아끼울 수 있다.
    private final PlayerEquipmentFactory equipmentFactory;

    public WarriorService(PlayerEquipmentFactory equipmentFactory) {
        this.equipmentFactory = equipmentFactory;
    }

    @Override
    public Player makePlayer() {
        return new Warrior(equipmentFactory.createArmor(), equipmentFactory.createWeapon());
    }
}
