package com.bytebinder.bytebinder.member.controller;

import com.bytebinder.bytebinder.member.controller.dto.JoinRequest;
import com.bytebinder.bytebinder.member.service.MemberService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
public class MemberController {
    // controller -> 모델과 뷰 사이에서 브릿지 역할을 수행
    // 앱의 사용자로부터 입력에 대한 응답으로 모델 및 뷰를 업데이트 하는 로직을 포함
    // 사용자의 요청은 모두 컨트롤러를 통해 진행 되어야 함
    // 컨트롤러(요청) -> 서비스 -> 레포지토리 -> 데이터베이스와 통신
    private final MemberService memberService;

    // 정보를 가져오는 역할
    @GetMapping("/hello")
    public String getHello(){
        return "Hello React World";
    }

    @PostMapping("/join")
    public String join(@RequestBody JoinRequest joinRequest){
        String result = memberService.join(joinRequest);

        if("success".equalsIgnoreCase(result)){
            return "success";
        }else {
            return "fail";
        }
    }
    // * API -> 응용프로그램에서 사용할 수 있도록 다른 응용프로그램을 제어할 수 있게 만든 인터페이스를 의미
    // * 여기서 인터페이스란 장치간 정보를 교환하기 위한 수단이나 방
    // * http Method : Create, Read, Update, Delete(REST API)
    // * @PutMapping
    // * @PostMapping -> 자원을 넣어주는 역할
    // * @DeleteMapping 네가지를 보통 사용

}
