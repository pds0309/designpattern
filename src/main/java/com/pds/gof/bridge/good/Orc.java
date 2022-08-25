package com.pds.gof.bridge.good;

public class Orc extends DefaultMonster {

    private static final String NAME = "오크";
    private static final String SCRIPT = "꾸엥아ㅣㄷ에융";

    public Orc() {
        super(NAME, SCRIPT);
    }

    public Orc(State state) {
        super(NAME, SCRIPT, state);
    }
}
