package com.bytebinder.bytebinder.member.repository;

import com.bytebinder.bytebinder.member.repository.entity.Member;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MemberRepository extends JpaRepository<Member, Long> {

}
