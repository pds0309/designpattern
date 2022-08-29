package com.pds.gof.chain_of_responsibilities.handler;

import com.pds.gof.chain_of_responsibilities.SignupRequest;

public class BaldCheckHandler extends AbstractSignupHandler {

    public BaldCheckHandler(SignupHandler signupHandler) {
        super(signupHandler);
    }

    @Override
    public void handle(SignupRequest signupRequest) {
        if (signupRequest.getName().contains("빡빡")) {
            throw new IllegalArgumentException("빡빡이는 안됩니다.");
        }
        System.out.println("빡빡이가 아님이 검증됨");
        super.handle(signupRequest);
    }
}
