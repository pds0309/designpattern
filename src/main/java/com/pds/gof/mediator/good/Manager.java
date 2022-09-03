package com.pds.gof.mediator.good;

import java.time.LocalDate;

public interface Manager {

    void requestContract();

    void requestYeNeungChulYeon(YeNeung yeNeung);

    void requestPanMeeting();
}
