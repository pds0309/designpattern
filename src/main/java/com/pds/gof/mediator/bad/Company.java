package com.pds.gof.mediator.bad;

import java.util.ArrayList;
import java.util.List;

public class Company {
    private List<Long> girlGroupIdList = new ArrayList<>();

    public void contract(Long girlGroupId) {
        girlGroupIdList.add(girlGroupId);
    }

}
