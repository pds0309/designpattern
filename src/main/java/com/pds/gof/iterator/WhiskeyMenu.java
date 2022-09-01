package com.pds.gof.iterator;

import com.pds.gof.iterator.good.LiquorPriceDescIterator;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

public class WhiskeyMenu implements LiquorMenu {

    List<Liquor> liquorList = new ArrayList<>();

    public WhiskeyMenu() {
        liquorList.add(new Liquor("임페리얼12년", 10000));
        liquorList.add(new Liquor("잭다니엘", 14000));
        liquorList.add(new Liquor("맥켈란12년", 18000));
        liquorList.add(new Liquor("조니워커블랙", 15000));
    }

    @Override
    public Collection<Liquor> getAll() {
        return liquorList;
    }

    @Override
    public Iterator<Liquor> priceDescIterator() {
        return new LiquorPriceDescIterator(this.liquorList);
    }

}
