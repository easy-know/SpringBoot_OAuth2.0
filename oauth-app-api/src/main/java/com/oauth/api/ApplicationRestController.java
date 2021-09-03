package com.oauth.api;

import com.oauth.application.dto.ApplicationDto;
import com.oauth.application.service.ApplicationService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Description :
 *
 * @author leejinho
 * @version 1.0
 */
@RestController
@RequiredArgsConstructor
public class ApplicationRestController {

    private final ApplicationService applicationService;

    @PostMapping
    public ResponseEntity save(ApplicationDto applicationDto) {
        String savedId = applicationService.save(applicationDto);
        return ResponseEntity.ok().body(savedId);
    }
}
