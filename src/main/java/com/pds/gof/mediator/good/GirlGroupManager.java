package com.pds.gof.mediator.good;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class GirlGroupManager implements Manager {


    private final Company company;
    private final GirlGroup girlGroup;
    private final PanClub panClub;
    private final MusicBank musicBank;
    private final List<YeNeung> yeNeungList = new ArrayList<>();

    public GirlGroupManager(Company company, GirlGroup girlGroup, PanClub panClub, MusicBank musicBank) {
        this.girlGroup = girlGroup;
        this.company = company;
        this.panClub = panClub;
        this.musicBank = musicBank;
    }

    @Override
    public void requestContract() {
        company.contract(this.girlGroup.getId());
    }

    @Override
    public void requestYeNeungChulYeon(YeNeung yeNeung) {
        if (yeNeung.acceptChulYeon(this.girlGroup.getId())) {
            yeNeungList.add(yeNeung);
        }
    }

    @Override
    public void requestPanMeeting() {
        this.panClub.addHistory(LocalDate.now());
    }

    public void requestPerform() {
        musicBank.addPerformer(this.girlGroup.getId());
    }
}
