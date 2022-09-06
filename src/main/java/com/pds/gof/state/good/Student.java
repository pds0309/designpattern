package com.pds.gof.state.good;

import com.pds.gof.state.good.state.Ok;
import com.pds.gof.state.good.state.StudentState;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
public class Student {
    private String name;
    private StudentState state;
}
