package com.pds.gof.adapter.adaptee;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
public class Member {
    private String name;
    private String password;
    private int age;
}
