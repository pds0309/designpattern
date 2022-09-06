package com.pds.gof.state.bad;


import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public class Student {
    private StudentState studentState;
    private String name;


    enum StudentState {
        LEAVE, OK
    }


}
