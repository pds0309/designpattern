package com.pds.gof.mediator.good;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class PanClub {
    public List<LocalDate> meetingHistory = new ArrayList<>();


    public void addHistory(LocalDate localDate) {
        meetingHistory.add(localDate);
    }

}
