package com.pds.gof.mediator.bad;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class GirlGroup {

    private Long id;
    private Company company;
    private MusicBank musicBank;
    private PanClub panClub;

    private List<YeNeung> chulYeonYeNeungList = new ArrayList<>();


    public GirlGroup(Long id, Company company, MusicBank musicBank, PanClub panClub) {
        this.id = id;
        this.company = company;
        this.musicBank = musicBank;
        this.panClub = panClub;
    }

    public void requestPerform() {
        musicBank.addPerformer(this.id);
    }

    public void requestPanMeeting() {
        panClub.addHistory(LocalDate.now());
    }

    public void requestContract() {
        company.contract(this.id);
    }

    public void requestYeNeungChulYeon(YeNeung yeNeung) {
        if (yeNeung.acceptChulYeon(this.id)) {
            chulYeonYeNeungList.add(yeNeung);
        }
    }

    public void doPractice() {
        System.out.println("무대 연습");
    }

    public Long getId() {
        return id;
    }
}
