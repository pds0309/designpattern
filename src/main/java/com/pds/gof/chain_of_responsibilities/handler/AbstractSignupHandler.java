package com.pds.gof.chain_of_responsibilities.handler;

import com.pds.gof.chain_of_responsibilities.SignupRequest;

public abstract class AbstractSignupHandler implements SignupHandler {
    private final SignupHandler signupHandler;

    protected AbstractSignupHandler(SignupHandler signupHandler) {
        this.signupHandler = signupHandler;
    }

    @Override
    public void handle(SignupRequest signupRequest) {
        if (signupHandler != null) {
            signupHandler.handle(signupRequest);
        }
    }
}
