package com.pds.gof.mediator.bad;

import java.util.ArrayList;
import java.util.List;

public class YeNeung {

    List<Long> chulYeonJaList = new ArrayList<>();

    public boolean acceptChulYeon(Long id) {
        if (1 == 1) {
            chulYeonJaList.add(id);
            return true;
        }
        return false;
    }
}
