package com.bytebinder.bytebinder.member.service.impl;

import com.bytebinder.bytebinder.member.controller.dto.JoinRequest;
import com.bytebinder.bytebinder.member.repository.MemberRepository;
import com.bytebinder.bytebinder.member.repository.entity.Member;
import com.bytebinder.bytebinder.member.service.MemberService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class MemberServiceImpl implements MemberService {
    // * 멤버 서비스를 구현체로 삼겠다
    // * 오버라이딩을 써서 구현

    private final MemberRepository memberRepository;

    @Override
    public String join(JoinRequest joinRequest) {
        Member member = Member.builder()
                .id(joinRequest.getId())
                .name(joinRequest.getName())
                .phoneNumber(joinRequest.getPhoneNumber())
                .build();

        memberRepository.save(member);
        return "success";
    }
}
