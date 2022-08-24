package com.pds.gof.abstractfactory.obj;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public abstract class Player {
    private final Armor armor;
    private final Weapon weapon;

    abstract void attack();
}
