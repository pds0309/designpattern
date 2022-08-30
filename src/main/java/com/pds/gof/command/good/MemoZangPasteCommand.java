package com.pds.gof.command.good;

import com.pds.gof.command.bad.MemoZang;

public class MemoZangPasteCommand implements Command {

    private final MemoZang memoZang;

    public MemoZangPasteCommand(MemoZang memoZang) {
        this.memoZang = memoZang;
    }

    @Override
    public void press(String str) {
        memoZang.paste(str);
    }

}
