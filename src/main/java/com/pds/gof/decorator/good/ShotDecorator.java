package com.pds.gof.decorator.good;

public class ShotDecorator extends CoffeeDecorator {

    public ShotDecorator(CoffeeService coffeeService) {
        super(coffeeService);
    }

    @Override
    public void makeAmericano() {
        System.out.print("샷이 추가된 ");
        super.makeAmericano();
    }

}
