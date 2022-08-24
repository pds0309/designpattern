package com.pds.gof.factorymethod.good;

public interface TacoTruck {

    GoodTaco createTaco();

    default GoodTaco orderTaco() {
        GoodTaco goodTaco = createTaco();
        printResult(goodTaco.name(), goodTaco.price());
        return goodTaco;
    }

    private static void printResult(String name, int price) {
        System.out.println(name + "은 " + price + "원입니다.");
    }
}
