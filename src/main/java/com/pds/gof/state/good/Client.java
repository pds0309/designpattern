package com.pds.gof.state.good;

import com.pds.gof.state.good.state.Leave;
import com.pds.gof.state.good.state.Ok;

public class Client {
    public static void main(String[] args) {
        Student student = new Student("김갑환", new Leave());
        Student student1 = new Student("최번개", new Ok());
        School school = new School();
        school.addStudent(student);
        school.addStudent(student1);
        school.alert("hi");

        student1.setState(new Leave());
        school.alert("hello");
    }
}
