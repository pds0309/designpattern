package com.pds.gof.chain_of_responsibilities;

import com.pds.gof.chain_of_responsibilities.handler.AuthHandler;
import com.pds.gof.chain_of_responsibilities.handler.BaldCheckHandler;
import com.pds.gof.chain_of_responsibilities.handler.SignupHandler;
import com.pds.gof.chain_of_responsibilities.handler.SuccessHandler;
import lombok.AccessLevel;
import lombok.NoArgsConstructor;

@NoArgsConstructor(access = AccessLevel.PRIVATE)
public class HandlerChain {
    public static SignupHandler setChain() {
        return new BaldCheckHandler(new AuthHandler(new SuccessHandler(null)));
    }
}
