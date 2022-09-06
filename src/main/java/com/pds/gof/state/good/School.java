package com.pds.gof.state.good;


import lombok.Getter;

import java.util.ArrayList;
import java.util.List;


@Getter
public class School {
    private List<Student> studentList = new ArrayList<>();

    public void addStudent(Student student) {
        studentList.add(student);
    }

    public void alert(String message) {
        studentList.forEach(student -> student.getState().alert(message, student));
    }
}
