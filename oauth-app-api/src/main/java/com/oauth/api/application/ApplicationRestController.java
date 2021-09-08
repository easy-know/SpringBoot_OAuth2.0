package com.oauth.api.application;

import com.oauth.application.dto.ApplicationDto;
import com.oauth.application.service.ApplicationService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.ResponseEntity;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.annotation.AuthenticationPrincipal;
import org.springframework.security.core.context.SecurityContext;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.net.URI;
import java.security.Principal;

/**
 * Description :
 *
 * @author leejinho
 * @version 1.0
 */
@Slf4j
@RestController
@RequiredArgsConstructor
@RequestMapping("/api/application")
public class ApplicationRestController {

    private final ApplicationService applicationService;

    @GetMapping
    public ResponseEntity load(Authentication authentication, Principal principal) {
        System.out.println("authentication: " + authentication);
        System.out.println("principal: " + principal);

        return ResponseEntity.ok(applicationService.loadAll());
    }

    @PostMapping
    public ResponseEntity save(ApplicationDto applicationDto) {

        log.info("ApplicationRestController - save(): " + applicationDto.getName());
        String savedId = applicationService.save(applicationDto);
        return ResponseEntity.created(URI.create("http://localhost:8080/application"))
                .body(savedId);
//        return ResponseEntity.ok().body(savedId);
    }
}
