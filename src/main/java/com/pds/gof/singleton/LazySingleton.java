package com.pds.gof.singleton;

import java.io.Serializable;

public class LazySingleton implements Serializable {

    private LazySingleton() {
    }

    public static LazySingleton getInstance() {
        return LazyHolder.INSTANCE;
    }

    private static class LazyHolder {
        private static final LazySingleton INSTANCE = new LazySingleton();
    }

}
