package com.pds.gof.factorymethod.good;

public record GoodTaco(String name, String contents, int price) {
    public GoodTaco(String name, String contents, int price) {
        this.name = name + " 타코야키";
        this.contents = contents;
        this.price = price;
    }

}
