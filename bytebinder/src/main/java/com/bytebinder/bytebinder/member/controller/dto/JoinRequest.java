package com.bytebinder.bytebinder.member.controller.dto;

import lombok.Data;

@Data
public class JoinRequest {
    // * 서비스 간의 전달 시 DTO를 따로 만듬
    // * 엔티티의 정보를 변경하기 전에 데이터를 가공하거나 전달하는 역할
    // * 엔티티만 사용시 정보의 변경을 통제하기 어렵기 때문에 사용

    private  Long index;

    private String id;

    private String name;

    private String phoneNumber;
}
