package com.pds.gof.command.good;

public class Button {

    private final Command command;

    public Button(Command command) {
        this.command = command;
    }

    public void pushWithText(String str) {
        command.press(str);
    }
}
