package com.pds.gof.composite.bad;

import lombok.Getter;

import java.util.ArrayList;
import java.util.List;

@Getter
public class Bucket {
    private final List<Item> itemList = new ArrayList<>();

    public void addItem(Item item) {
        itemList.add(item);
    }


    public void printPrice() {
        System.out.println(this.itemList.stream().mapToInt(Item::getPrice).sum());
    }
}
