package com.bytebinder.bytebinder.member.repository;

import com.bytebinder.bytebinder.member.repository.entity.Member;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class MemberRepositoryTest {
    // 멤버 레파지토리를 가져다 쓰기 위해 빈 객체를 끌어오기 위한 어노테이션
    @Autowired
    private MemberRepository memberRepository;

    @Test
    public void crudTest() {
        Member member = Member.builder()
                .id("flature")
                .name("플레처")
                .phoneNumber("010-0000-0000")
                .build();

        //create test
        memberRepository.save(member);

        //get test
        Member foundMember = memberRepository.findById(1L).get();

    }
}
