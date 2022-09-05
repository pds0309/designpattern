package com.pds.gof.memento.good;

public class Client {
    public static void main(String[] args) {
        Game game = new Game();
        game.setBlueTeamScore(20);
        game.setRedTeamScore(15);

        GameSave gameSave = game.save();

        game.setRedTeamScore(55);
        game.setBlueTeamScore(55);

        game.restore(gameSave);
    }
}
