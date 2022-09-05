package com.pds.gof.memento.good;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Game {
    private int redTeamScore;
    private int blueTeamScore;

    public GameSave save() {
        return new GameSave(blueTeamScore, redTeamScore);
    }

    public void restore(GameSave gameSave) {
        this.redTeamScore = gameSave.getRedTeamScore();
        this.blueTeamScore = gameSave.getBlueTeamScore();
    }
}
