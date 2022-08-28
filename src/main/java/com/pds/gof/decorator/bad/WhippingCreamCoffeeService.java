package com.pds.gof.decorator.bad;

public class WhippingCreamCoffeeService extends CoffeeService {
    @Override
    public void makeAmericano() {
        System.out.print("휘핑크림을 추가한");
        super.makeAmericano();
    }

}
