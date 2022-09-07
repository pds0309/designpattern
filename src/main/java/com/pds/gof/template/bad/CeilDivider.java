package com.pds.gof.template.bad;

public class CeilDivider {

    public double divide(double a, double b) {
        if (a == 0) {
            throw new IllegalArgumentException();
        }
        if (b == 0) {
            throw new IllegalArgumentException();
        }
        return Math.ceil(a / b);
    }
}
