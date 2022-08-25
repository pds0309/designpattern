package com.pds.gof.bridge.good;

public class Bandit extends DefaultMonster {

    private static final String NAME = "산적";
    private static final String SCRIPT = "흐흐흐... 통행세를 내라!";

    public Bandit() {
        super(NAME, SCRIPT);
    }

    public Bandit(State state) {
        super(NAME, SCRIPT, state);
    }
}
