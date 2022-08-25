package com.pds.gof.adapter;

import com.pds.gof.adapter.adaptee.MemberRepository;
import com.pds.gof.adapter.adaptee.MemberService;
import com.pds.gof.adapter.adapter.MemberServiceAdapter;
import com.pds.gof.adapter.target.UserDetailsService;

public class Client {
    public static void main(String[] args) {
        UserDetailsService userDetailsService = new MemberServiceAdapter(new MemberService(new MemberRepository()));
        LoginHandler loginHandler = new LoginHandler(userDetailsService);
        System.out.println(loginHandler.login("hello", "1234"));
    }
}
