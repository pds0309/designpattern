package com.pds.gof.iterator;


import lombok.Getter;

@Getter
public class Liquor {
    private final String name;
    private final int price;

    public Liquor(String name, int price) {
        this.name = name;
        this.price = price;
    }

    @Override
    public String toString() {
        return "Liquor{" +
                "name='" + name + '\'' +
                ", price=" + price +
                '}';
    }
}
