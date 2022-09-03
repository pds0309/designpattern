package com.pds.gof.mediator.bad;

import java.util.ArrayList;
import java.util.List;

public class MusicBank {

    private List<Long> performerList = new ArrayList<>();

    public void addPerformer(Long id) {
        performerList.add(id);
    }


}
