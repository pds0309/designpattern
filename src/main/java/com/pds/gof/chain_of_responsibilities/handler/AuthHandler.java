package com.pds.gof.chain_of_responsibilities.handler;


import com.pds.gof.chain_of_responsibilities.SignupRequest;

public class AuthHandler extends AbstractSignupHandler {

    public AuthHandler(SignupHandler signupHandler) {
        super(signupHandler);
    }

    @Override
    public void handle(SignupRequest signupRequest) {
        if (signupRequest.getPassword().length() < 4) {
            throw new IllegalArgumentException("비밀번호가 너무 짧음");
        }
        System.out.println("비밀번호가 적절함이 검증됨");
        super.handle(signupRequest);
    }
}
