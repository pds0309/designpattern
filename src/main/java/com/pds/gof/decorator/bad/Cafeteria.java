package com.pds.gof.decorator.bad;

public class Cafeteria {
    private final CoffeeService coffeeService;

    public Cafeteria(CoffeeService coffeeService) {
        this.coffeeService = coffeeService;
    }

    public void orderCoffee() {
        coffeeService.makeAmericano();
    }

}
