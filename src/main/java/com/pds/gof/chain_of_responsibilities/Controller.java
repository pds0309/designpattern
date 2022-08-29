package com.pds.gof.chain_of_responsibilities;

import com.pds.gof.chain_of_responsibilities.handler.SignupHandler;

public class Controller {

    private final SignupHandler signupHandler;

    public Controller(SignupHandler signupHandler) {
        this.signupHandler = signupHandler;
    }

    public void doSignupRequest(String name, String password) {
        SignupRequest signupRequest = new SignupRequest(name, password);
        signupHandler.handle(signupRequest);
    }
}
