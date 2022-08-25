package com.pds.gof.adapter.adapter;

import com.pds.gof.adapter.adaptee.Member;
import com.pds.gof.adapter.target.UserDetails;

public class MemberUserDetails implements UserDetails {

    private final Member member;

    public MemberUserDetails(Member member) {
        this.member = member;
    }

    @Override
    public String getUserName() {
        return member.getName();
    }

    @Override
    public String getPassword() {
        return member.getPassword();
    }
}
