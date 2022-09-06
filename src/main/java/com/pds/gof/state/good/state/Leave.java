package com.pds.gof.state.good.state;

import com.pds.gof.state.good.Student;

public class Leave implements StudentState {
    @Override
    public void alert(String message, Student student) {
        System.out.println("휴학중이라 메시지 전송 불가능");
    }
}
