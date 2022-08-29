package com.pds.gof.chain_of_responsibilities.handler;

import com.pds.gof.chain_of_responsibilities.SignupRequest;

public class SuccessHandler extends AbstractSignupHandler {


    public SuccessHandler(SignupHandler signupHandler) {
        super(signupHandler);
    }

    @Override
    public void handle(SignupRequest signupRequest) {
        System.out.println("회원가입 완료했다.");
        super.handle(signupRequest);
    }
}
