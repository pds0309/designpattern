package com.pds.gof.decorator.good;

public class CoffeeDecorator implements CoffeeService {

    private final CoffeeService coffeeService;

    public CoffeeDecorator(CoffeeService coffeeService) {
        this.coffeeService = coffeeService;
    }

    @Override
    public void makeAmericano() {
        coffeeService.makeAmericano();
    }

}
