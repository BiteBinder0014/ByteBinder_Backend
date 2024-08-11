package com.bytebinder.bytebinder.member.repository.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.*;

@Entity
@NoArgsConstructor
@AllArgsConstructor(access = AccessLevel.PRIVATE)
@Builder
@Getter
public class Member {
    // * 어떤 값을 받을 것인가 -> entity
    // * 테이블 설계를 하는 역할
    // * 필드 변수들을 바탕으로 데이터 컬럼을 구성해줌

    // * DB 정보의 데이터 오브젝트의 DTO
    // * 데이터베이스의 정보를 DTO화 함
    // * DB와 직접적으로 통하는 역할

    // 엔티티나 디티오 한 패키지에 몰아넣는게 좋음


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY) // * 데이터가 들어올때마다 자동으로 채번해주는 역할
    private Long index;

    private String id;

    private String name;

    private String phoneNumber;
}
