package com.pds.gof.state.bad;

import lombok.Getter;

import java.util.ArrayList;
import java.util.List;


@Getter
public class School {

    private List<Student> studentList = new ArrayList<>();

    public void alert(String message) {
        studentList.forEach(student -> {
            if (student.getStudentState() == Student.StudentState.LEAVE) {
                System.out.println("휴학중이라 메시지 전송 불가능");
            }
            if (student.getStudentState() == Student.StudentState.OK) {
                System.out.println(student.getName() + "님 " + message);
            }
        });
    }
}
