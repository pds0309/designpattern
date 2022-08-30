package com.pds.gof.command.good;

import com.pds.gof.command.bad.Hangul2010;
import com.pds.gof.command.bad.MemoZang;

public class Client {
    public static void main(String[] args) {
        MemoZang memoZang = new MemoZang();
        Button button = new Button(new MemoZangPasteCommand(memoZang));
        button.pushWithText("hello");

        Hangul2010 hangul2010 = new Hangul2010();
        Button button2 = new Button(new HangulPasteCommand(hangul2010));
        button2.pushWithText("hello");
    }
}
