package com.pds.gof.adapter.adaptee;

public class MemberRepository {

    public Member findByName(String name) {
        return new Member(name, "1234", 15);
    }
}
