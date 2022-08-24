package com.pds.gof.factorymethod.good;

public class NormalTacoMaker implements TacoTruck {
    @Override
    public GoodTaco createTaco() {
        return new GoodTaco("보통맛", "Octopus's Leg", 1500);
    }
}
