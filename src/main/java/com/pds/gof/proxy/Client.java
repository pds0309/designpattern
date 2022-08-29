package com.pds.gof.proxy;

import com.pds.gof.proxy.proxy.GameProcessProxy;
import com.pds.gof.proxy.subject.GameService;
import com.pds.gof.proxy.subject.GameServiceImpl;

public class Client {
    public static void main(String[] args) {
        // 게임 시작이라는 순수한 동작에 매우 오랜시간이 걸린다.
        // 게임 로딩동안 사용자에게 유용한 정보를 보여주는 기능을 만들때 이 기능을 게임 시작 기능에 넣어야할까?
        // no proxy
//        GameService gameService = new GameServiceImpl();
//        gameService.start();
        // proxy
        GameService gameService2 = new GameProcessProxy(new GameServiceImpl());
        gameService2.start();
    }
}
