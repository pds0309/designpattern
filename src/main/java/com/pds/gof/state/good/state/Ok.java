package com.pds.gof.state.good.state;

import com.pds.gof.state.good.Student;

public class Ok implements StudentState {

    @Override
    public void alert(String message, Student student) {
        System.out.println(student.getName() + " 님" + message);
    }
}
