package com.pds.gof.proxy.dynamic;

public class Client {
    public static void main(String[] args) {
        MyProxy proxy = new MyProxy();
        GameService gameService = proxy.dynamicProxy();
        gameService.start();
        gameService.end();
    }
}
