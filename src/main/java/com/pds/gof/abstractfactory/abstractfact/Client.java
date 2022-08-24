package com.pds.gof.abstractfactory.abstractfact;

public class Client {

    public static void main(String[] args) {
        String request = "WIZ";
        System.out.println(PlayerController.of(request).create().getClass());
    }

}
