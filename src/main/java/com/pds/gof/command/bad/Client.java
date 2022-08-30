package com.pds.gof.command.bad;

public class Client {
    public static void main(String[] args) {
        MemoZang memoZang = new MemoZang();
        MemoZangPasteButton memoZangPasteButton = new MemoZangPasteButton(memoZang);
        memoZangPasteButton.press("안녕");
        
        Hangul2010 hangul2010 = new Hangul2010();
        Hangul2010PasteButton hangul2010PasteButton = new Hangul2010PasteButton(hangul2010);
        hangul2010PasteButton.press("안녕");
    }
}
