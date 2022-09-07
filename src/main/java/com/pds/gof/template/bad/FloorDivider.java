package com.pds.gof.template.bad;

public class FloorDivider {

    public double divide(double a, double b) {
        if (a == 0) {
            throw new IllegalArgumentException();
        }
        if (b == 0) {
            throw new IllegalArgumentException();
        }
        return Math.floor(a / b);
    }
}
