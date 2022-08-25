package com.pds.gof.bridge.good;

import com.pds.gof.bridge.bad.Monster;
import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

@NoArgsConstructor(access = AccessLevel.PRIVATE)
@AllArgsConstructor
public abstract class DefaultMonster implements Monster {
    private String name;
    private String script;
    private State state;


    protected DefaultMonster(String name, String script) {
        this.name = name;
        this.script = script;
        this.state = () -> "";
    }

    @Override
    public void chat() {
        System.out.printf("[%s%s]: %s%n", state.getState(), name, script);
    }
}
