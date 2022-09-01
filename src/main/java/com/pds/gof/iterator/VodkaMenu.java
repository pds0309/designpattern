package com.pds.gof.iterator;

import com.pds.gof.iterator.good.LiquorPriceDescIterator;

import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class VodkaMenu implements LiquorMenu {
    private final Set<Liquor> vodkaSet = new HashSet<>();

    public VodkaMenu() {
        vodkaSet.add(new Liquor("앱솔루트", 7000));
        vodkaSet.add(new Liquor("그레이구스", 11000));
        vodkaSet.add(new Liquor("스미노프", 6000));
    }

    @Override
    public Collection<Liquor> getAll() {
        return vodkaSet;
    }

    @Override
    public Iterator<Liquor> priceDescIterator() {
        return new LiquorPriceDescIterator(this.vodkaSet);
    }


}
