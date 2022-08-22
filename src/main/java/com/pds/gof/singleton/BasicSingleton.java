package com.pds.gof.singleton;

public class BasicSingleton {

    static BasicSingleton instance;

    private BasicSingleton() {
    }

    public static BasicSingleton getInstance() {
        if (instance == null) {
            instance = new BasicSingleton();
        }
        return instance;
    }
}
