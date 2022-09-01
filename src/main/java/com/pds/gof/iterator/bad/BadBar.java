package com.pds.gof.iterator.bad;

import com.pds.gof.iterator.LiquorMenu;

public class BadBar {

    private final LiquorMenu liquorMenu;

    public BadBar(LiquorMenu cocktailMenu) {
        this.liquorMenu = cocktailMenu;
    }

    public void showMenu() {
        liquorMenu.getAll().forEach(System.out::println);
    }

    public void showPriceDescMenu() {
        liquorMenu.getAll().stream()
                .sorted((o1, o2) -> o2.getPrice() - o1.getPrice())
                .forEach(System.out::println);
    }
}
