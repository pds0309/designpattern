package com.pds.gof.chain_of_responsibilities.handler;

import com.pds.gof.chain_of_responsibilities.SignupRequest;

public interface SignupHandler {

    void handle(SignupRequest signupRequest);
}
