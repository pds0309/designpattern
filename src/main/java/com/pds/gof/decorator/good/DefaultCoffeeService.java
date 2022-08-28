package com.pds.gof.decorator.good;

public class DefaultCoffeeService implements CoffeeService {

    @Override
    public void makeAmericano() {
        System.out.println("아메리카노 생성");
    }
}
