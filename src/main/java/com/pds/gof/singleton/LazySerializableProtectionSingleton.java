package com.pds.gof.singleton;

import java.io.Serializable;

public class LazySerializableProtectionSingleton implements Serializable {

    private LazySerializableProtectionSingleton() {
    }

    public static LazySerializableProtectionSingleton getInstance() {
        return LazyHolder.INSTANCE;
    }

    private static class LazyHolder {
        private static final LazySerializableProtectionSingleton INSTANCE = new LazySerializableProtectionSingleton();
    }

    // prohibit make new Instance during deserialization
    protected Object readResolve() {
        System.out.println("de-serialization");
        return getInstance();
    }

}

