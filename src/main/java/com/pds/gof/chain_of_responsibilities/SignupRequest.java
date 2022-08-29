package com.pds.gof.chain_of_responsibilities;

import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor
@Getter
public class SignupRequest {
    private final String name;
    private final String password;

}
