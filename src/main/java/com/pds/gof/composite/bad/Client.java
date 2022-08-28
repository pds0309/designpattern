package com.pds.gof.composite.bad;

public class Client {
    public static void main(String[] args) {
        Bucket bucket = new Bucket();
        Item shoes = new Item("신발", 5500);
        Item hat = new Item("모자", 3500);
        bucket.addItem(shoes);
        bucket.addItem(hat);

        // 단일 상품 가격 조회
        printItemPrice(hat);

        // 장바구니에 담긴 모든 아이템 가격 조회
        printBucketPrice(bucket);
    }

    private static void printBucketPrice(Bucket bucket) {
        bucket.printPrice();
    }

    private static void printItemPrice(Item item) {
        System.out.println(item.getPrice());
    }
}
