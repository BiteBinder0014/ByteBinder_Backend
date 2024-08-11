package com.bytebinder.bytebinder.member.repository;

import com.bytebinder.bytebinder.member.repository.entity.Member;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface MemberRepository extends JpaRepository<Member, Long> {

    @Query("select * from dual")
    public Member findByUsername(String username);

}
