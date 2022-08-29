package com.pds.gof.chain_of_responsibilities;

import com.pds.gof.chain_of_responsibilities.handler.SignupHandler;

public class Client {
    private static final SignupHandler signupHandler = HandlerChain.setChain();

    public static void main(String[] args) {
        Controller controller = new Controller(signupHandler);
        controller.doSignupRequest("빡복이", "12356");
    }
}
