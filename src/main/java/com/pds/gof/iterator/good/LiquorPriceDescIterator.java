package com.pds.gof.iterator.good;

import com.pds.gof.iterator.Liquor;

import java.util.Collection;
import java.util.Iterator;

public class LiquorPriceDescIterator implements Iterator<Liquor> {

    private final Iterator<Liquor> internalIterator;

    public LiquorPriceDescIterator(Collection<Liquor> liquors) {
        this.internalIterator = liquors.stream()
                .sorted((o1, o2) -> o2.getPrice() - o1.getPrice())
                .iterator();
    }

    @Override
    public boolean hasNext() {
        return this.internalIterator.hasNext();
    }

    @Override
    public Liquor next() {
        return this.internalIterator.next();
    }
}
