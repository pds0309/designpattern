package com.pds.gof.composite.good;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public class Item implements Component {
    private String name;
    private int price;

}
