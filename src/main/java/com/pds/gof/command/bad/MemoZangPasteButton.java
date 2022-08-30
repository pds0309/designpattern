package com.pds.gof.command.bad;

public class MemoZangPasteButton {
    private MemoZang memoZang;

    public MemoZangPasteButton(MemoZang memoZang) {
        this.memoZang = memoZang;
    }

    public void press(String str) {
        System.out.println("메모장에 복사");
        memoZang.paste(str);
    }
}
