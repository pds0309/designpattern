package com.pds.gof.adapter;

import com.pds.gof.adapter.target.UserDetails;
import com.pds.gof.adapter.target.UserDetailsService;

public class LoginHandler {
    private final UserDetailsService userDetailsService;

    public LoginHandler(UserDetailsService userDetailsService) {
        this.userDetailsService = userDetailsService;
    }

    public String login(String username, String password) {
        UserDetails userDetails = userDetailsService.loadByUsername(username);
        if (userDetails.getPassword().equals(password)) {
            return userDetails.getUserName();
        }
        throw new IllegalArgumentException("");
    }
}
