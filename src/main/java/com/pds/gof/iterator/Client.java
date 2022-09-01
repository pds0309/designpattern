package com.pds.gof.iterator;

import com.pds.gof.iterator.bad.BadBar;
import com.pds.gof.iterator.good.GoodBar;

public class Client {
    private static final VodkaMenu vodkaMenu = new VodkaMenu();
    private static final WhiskeyMenu whiskeyMenu = new WhiskeyMenu();

    public static void main(String[] args) {
        BadBar badBar1 = new BadBar(vodkaMenu);
        badBar1.showMenu();
        System.out.println();
        badBar1.showPriceDescMenu();
        System.out.println();

        new GoodBar(vodkaMenu.iterator()).showMenu();
        System.out.println();
        new GoodBar(vodkaMenu.priceDescIterator()).showMenu();
    }
}
