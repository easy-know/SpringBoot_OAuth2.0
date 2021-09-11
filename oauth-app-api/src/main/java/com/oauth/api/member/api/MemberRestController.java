package com.oauth.api.member.api;

import com.oauth.member.dto.MemberDto;
import com.oauth.member.service.MemberService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

/**
 * Description :
 *
 * @author leejinho
 * @version 1.0
 */
@Slf4j
@RestController
public class MemberRestController {

    @Autowired
    private MemberService userService;

    @Autowired
    private PasswordEncoder passwordEncoder;

    @PostMapping("/api/member")
    public ResponseEntity signup(@RequestBody MemberDto memberRequestDto) {
        memberRequestDto.setPassword(passwordEncoder.encode(memberRequestDto.getPassword()));
        return ResponseEntity.ok(userService.signup(memberRequestDto));
    }
}
