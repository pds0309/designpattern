package com.pds.gof.memento.bad;

public class Client {
    public static void main(String[] args) {
        Game game = new Game();
        game.setBlueTeamScore(20);
        game.setRedTeamScore(15);

        // 클라이언트가 게임의 스코어 정보를 가져야만 하는 상태(노출되어야만 하는)
        // 상세정보를 알지 않고도 게임 내부 정보를 저장했다가 복원하는 형태를 위해 메멘토 패턴을 적용한다.
        int blueTeamTempScore = game.getBlueTeamScore();
        int redTeamTempScore = game.getRedTeamScore();

        Game restoreGame = new Game();
        restoreGame.setRedTeamScore(redTeamTempScore);
        restoreGame.setBlueTeamScore(blueTeamTempScore);
    }
}
