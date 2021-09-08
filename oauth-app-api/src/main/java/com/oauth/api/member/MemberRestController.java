package com.oauth.api.member;

import com.oauth.member.dto.MemberDto;
import com.oauth.member.service.MemberService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.net.URI;

/**
 * Description :
 *
 * @author leejinho
 * @version 1.0
 */
@Slf4j
@RestController
@RequestMapping("/api/member")
public class MemberRestController {

    @Autowired
    private MemberService userService;

    @Autowired
    private BCryptPasswordEncoder bCryptPasswordEncoder;

    @PostMapping
    public ResponseEntity<Long> save(@RequestBody MemberDto userDto) {
        log.info("Save(): " + userDto.getEmail());
        userDto.setPassword(bCryptPasswordEncoder.encode(userDto.getPassword()));

        return ResponseEntity.created(URI.create("http://localhost:8080/application"))
                .body(userService.save(userDto));
//        return ResponseEntity.ok().body(userService.save(userDto));
    }
}
