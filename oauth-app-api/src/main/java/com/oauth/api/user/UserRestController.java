package com.oauth.api.user;

import com.oauth.member.dto.MemberDto;
import com.oauth.member.service.MemberService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Description :
 *
 * @author leejinho
 * @version 1.0
 */
@RestController
@RequiredArgsConstructor
@RequestMapping("user")
public class UserRestController {
    private final MemberService userService;

    @PostMapping
    public ResponseEntity save(@RequestBody MemberDto userDto) {
        return ResponseEntity.ok().body(userService.save(userDto));
    }
}
