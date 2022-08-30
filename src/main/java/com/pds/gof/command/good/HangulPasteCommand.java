package com.pds.gof.command.good;

import com.pds.gof.command.bad.Hangul2010;

public class HangulPasteCommand implements Command {

    private final Hangul2010 hangul2010;

    public HangulPasteCommand(Hangul2010 hangul2010) {
        this.hangul2010 = hangul2010;

    }

    @Override
    public void press(String str) {
        hangul2010.paste(str);
    }

}
