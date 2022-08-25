package com.pds.gof.adapter.adapter;

import com.pds.gof.adapter.adaptee.MemberService;
import com.pds.gof.adapter.target.UserDetails;
import com.pds.gof.adapter.target.UserDetailsService;

public class MemberServiceAdapter implements UserDetailsService {

    private final MemberService memberService;

    public MemberServiceAdapter(MemberService memberService) {
        this.memberService = memberService;
    }

    @Override
    public UserDetails loadByUsername(String username) {
        return new MemberUserDetails(memberService.getMemberByName(username));
    }
}
