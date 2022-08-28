package com.pds.gof.decorator.good;

public class Cafetria {
    private final CoffeeService coffeeService;

    public Cafetria(CoffeeService coffeeService) {
        this.coffeeService = coffeeService;
    }

    public void orderCoffee() {
        coffeeService.makeAmericano();
    }

}
