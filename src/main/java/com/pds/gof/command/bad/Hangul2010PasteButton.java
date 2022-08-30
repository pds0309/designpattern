package com.pds.gof.command.bad;

public class Hangul2010PasteButton {
    private Hangul2010 hangul2010;

    public Hangul2010PasteButton(Hangul2010 hangul2010) {
        this.hangul2010 = hangul2010;
    }

    public void press(String str) {
        System.out.println("한글에 복사");
        hangul2010.paste(str);
    }
}
