package com.pds.gof.iterator;

import java.util.Collection;
import java.util.Iterator;

public interface LiquorMenu {

    Collection<Liquor> getAll();

    Iterator<Liquor> priceDescIterator();

    default Iterator<Liquor> iterator() {
        return this.getAll().iterator();
    }
}
