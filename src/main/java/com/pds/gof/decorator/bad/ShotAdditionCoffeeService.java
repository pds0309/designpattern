package com.pds.gof.decorator.bad;

public class ShotAdditionCoffeeService extends CoffeeService {
    @Override
    public void makeAmericano() {
        System.out.print("샷 한잔 추가된 ");
        super.makeAmericano();
    }
}
