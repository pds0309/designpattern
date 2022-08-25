package com.pds.gof.adapter.adaptee;

public class MemberService {

    private final MemberRepository memberRepository;

    public MemberService(MemberRepository memberRepository) {
        this.memberRepository = memberRepository;
    }

    public Member getMemberByName(String name) {
        return memberRepository.findByName(name);
    }

    public void updateMember() {

    }
}
