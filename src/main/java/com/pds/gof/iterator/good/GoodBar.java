package com.pds.gof.iterator.good;

import com.pds.gof.iterator.Liquor;

import java.util.Iterator;

public class GoodBar {
    private final Iterator<Liquor> liquorMenuIterator;

    public GoodBar(Iterator<Liquor> liquorMenuIterator) {
        this.liquorMenuIterator = liquorMenuIterator;
    }

    public void showMenu() {
        this.liquorMenuIterator.forEachRemaining(System.out::println);
    }
}
