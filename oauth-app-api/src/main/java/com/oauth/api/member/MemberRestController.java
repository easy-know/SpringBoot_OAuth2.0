package com.oauth.api.member;

import com.oauth.member.dto.MemberDto;
import com.oauth.member.service.MemberService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.net.URI;
import java.net.URISyntaxException;

/**
 * Description :
 *
 * @author leejinho
 * @version 1.0
 */
@RestController
@RequiredArgsConstructor
@RequestMapping("/api")
public class MemberRestController {
    private final MemberService userService;

    @PostMapping("/member")
    public ResponseEntity save(@RequestBody MemberDto userDto) throws URISyntaxException {
        return ResponseEntity.ok().body(userService.save(userDto));
    }
}
