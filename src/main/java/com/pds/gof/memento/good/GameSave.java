package com.pds.gof.memento.good;

import lombok.Getter;

// memento
@Getter
public class GameSave {

    // immutable
    private final int blueTeamScore;
    private final int redTeamScore;

    public GameSave(int blueTeamScore, int redTeamScore) {
        this.blueTeamScore = blueTeamScore;
        this.redTeamScore = redTeamScore;
    }

}
