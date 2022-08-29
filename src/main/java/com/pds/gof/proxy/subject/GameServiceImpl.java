package com.pds.gof.proxy.subject;

public class GameServiceImpl implements GameService {
    @Override
    public void start() {
        spendVeryLongTime();
        System.out.println("게임시작 성공");
    }

    private void spendVeryLongTime() {
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}
