package com.pds.gof.command.bad;

import java.util.ArrayList;
import java.util.List;

public class Hangul2010 {
    private List<String> texts = new ArrayList<>();

    public void paste(String str) {
        texts.add(str);
    }

}
