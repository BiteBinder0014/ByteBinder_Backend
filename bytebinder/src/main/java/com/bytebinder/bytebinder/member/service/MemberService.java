package com.bytebinder.bytebinder.member.service;

import com.bytebinder.bytebinder.member.controller.dto.JoinRequest;

public interface MemberService {
    // 이런 값들을 받겠다 라는 선언?
    String join(JoinRequest joinRequest);
}
