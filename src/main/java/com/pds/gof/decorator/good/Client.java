package com.pds.gof.decorator.good;


public class Client {

    // 손님의 요구라 친다.
    private static final boolean wannaAddWhippingCream = true;
    private static final boolean wannaAddShot = true;

    public static void main(String[] args) {
        CoffeeService currentCoffeeService = new DefaultCoffeeService();

        // 요구에 맞게 동적으로 설정했다고 친다.
        if (wannaAddShot) {
            currentCoffeeService = new ShotDecorator(currentCoffeeService);
        }
        if (wannaAddWhippingCream) {
            currentCoffeeService = new CreamDecorator(currentCoffeeService);
        }

        // 크림도 올려지고 샷도 올려지고 둘다 올려지기도 하는 카페가 되었다.
        Cafetria cafeteria = new Cafetria(currentCoffeeService);
        cafeteria.orderCoffee();
    }
}
