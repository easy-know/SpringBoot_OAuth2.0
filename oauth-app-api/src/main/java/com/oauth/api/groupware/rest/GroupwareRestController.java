package com.oauth.api.groupware.rest;

import com.oauth.groupware.dto.GroupwareDto;
import com.oauth.groupware.service.GroupwareService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
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
@Slf4j
@RestController
@RequestMapping("/api/groupware")
public class GroupwareRestController {

    @Autowired
    private GroupwareService groupwareService;

    @PostMapping("/login")
    public ResponseEntity loginGroupware(@RequestBody GroupwareDto groupwareDto) {
        log.info("loginGroupware() - " + groupwareDto.getEmail());
        return ResponseEntity.ok().body(groupwareService.loginGroupware(groupwareDto.getEmail(), groupwareDto.getPassword()));
    }
}
