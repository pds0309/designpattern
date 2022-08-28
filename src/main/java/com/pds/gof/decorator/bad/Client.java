package com.pds.gof.decorator.bad;

public class Client {

    private static final boolean wannaAddWhippingCream = true;
    private static final boolean wannaAddShot = true;

    public static void main(String[] args) {
        Cafeteria cafeteria = new Cafeteria(new CoffeeService());

        if (wannaAddWhippingCream) {
            cafeteria = new Cafeteria(new WhippingCreamCoffeeService());
        }
        cafeteria.orderCoffee();

        // 휘핑 크림과 샷을 둘다 추가하고자 할 때 직접 상속으로 로직을 처리했기 때문에 휘핑크림 + 샷 이 구현될 수 있는 서비스를 새로 추가해야함

    }

}
