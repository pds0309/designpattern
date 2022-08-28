package com.pds.gof.composite.good;


public class Client {
    public static void main(String[] args) {
        Bucket bucket = new Bucket();
        Item shoes = new Item("신발", 3500);
        Item hat = new Item("모자", 5500);
        bucket.addItem(shoes);
        bucket.addItem(hat);

        printPrice(bucket);
        printPrice(shoes);
    }

    // 전체 또는 부분을 동일하게 처리할 수 있다.
    private static void printPrice(Component component) {
        System.out.println(component.getPrice());
    }
}
