package com.pds.gof.proxy.dynamic;

public class GameServiceImpl implements GameService {
    public void start() {
        spendVeryLongTime();
        System.out.println("게임시작");
    }

    public void end() {
        spendVeryLongTime();
        System.out.println("게임종료");
    }

    private void spendVeryLongTime() {
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}
