package com.pds.gof.template.good;

public class Client {
    public static void main(String[] args) {
        Divider divider = new Divider(Divider.Policy.CEIL);
        System.out.println(divider.divide(3.1, 2));
    }
}
