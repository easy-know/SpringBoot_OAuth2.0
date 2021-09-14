package com.oauth.api.application.rest;

import com.oauth.application.dto.ApplicationDto;
import com.oauth.application.service.ApplicationService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
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

    @Autowired
    private PasswordEncoder passwordEncoder;

    @GetMapping
    public ResponseEntity load(Principal principal) {
        log.info("load(): " + principal.getName());

        return ResponseEntity.ok(applicationService.loadAll());
    }

    @GetMapping("/{name}")
    public ResponseEntity loadDetail(@PathVariable("name") String name) {
        log.info("loadDetail(): " + name);

        return ResponseEntity.ok(applicationService.loadDetail(name));
    }

    @PostMapping
    public ResponseEntity save(@RequestBody ApplicationDto applicationDto) {
        log.info("ApplicationRestController - save(): " + applicationDto.getName());

        String clientSecret = passwordEncoder.encode(applicationDto.getName());

        return ResponseEntity.created(URI.create("http://localhost:8080/application"))
                .body(applicationService.save(applicationDto, clientSecret));
    }
}
