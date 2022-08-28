package com.pds.gof.decorator.good;

public class CreamDecorator extends CoffeeDecorator {

    public CreamDecorator(CoffeeService coffeeService) {
        super(coffeeService);
    }

    @Override
    public void makeAmericano() {
        System.out.print("휘핑 크림이 올려진 ");
        super.makeAmericano();
    }

}
