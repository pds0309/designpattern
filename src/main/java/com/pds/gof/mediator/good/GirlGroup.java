package com.pds.gof.mediator.good;

public class GirlGroup {

    private Long id;

    public GirlGroup(Long id) {
        this.id = id;
    }

    public void doPractice() {
        System.out.println("무대 연습");
    }

    public Long getId() {
        return id;
    }

}
