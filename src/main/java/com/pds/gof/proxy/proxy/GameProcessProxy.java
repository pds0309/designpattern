package com.pds.gof.proxy.proxy;

import com.pds.gof.proxy.subject.GameService;

public class GameProcessProxy implements GameService {

    private final GameService gameService;

    public GameProcessProxy(GameService gameService) {
        this.gameService = gameService;
    }

    @Override
    public void start() {
        printMessageForLoadingTime();
        gameService.start();
    }

    private void printMessageForLoadingTime() {
        System.out.println("어서오세용~");
        System.out.println("Tip: 일일 보상을 항상 확인하세요!");
    }
}
