package com.pds.gof.adapter.target;

public interface UserDetailsService {
    UserDetails loadByUsername(String username);
}
