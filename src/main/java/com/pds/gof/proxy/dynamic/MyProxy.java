package com.pds.gof.proxy.dynamic;

import java.lang.reflect.Proxy;

public class MyProxy {
    protected GameService dynamicProxy() {
        return getGameServiceProxy(new GameServiceImpl());
    }

    private GameService getGameServiceProxy(GameService gameService) {
        return (GameService) Proxy.newProxyInstance(this.getClass().getClassLoader(), new Class[]{GameService.class}, (proxy, method, args) -> {
            System.out.println("좀만 기다려주세요");
            method.invoke(gameService, args);
            return null;
        });
    }
}
