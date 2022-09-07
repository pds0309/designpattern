package com.pds.gof.template.bad;

public class Client {
    public static void main(String[] args) {
        CeilDivider ceilDivider = new CeilDivider();
        System.out.println(ceilDivider.divide(3.1, 2));
        FloorDivider floorDivider = new FloorDivider();
        System.out.println(floorDivider.divide(3.1, 2));
    }
}
