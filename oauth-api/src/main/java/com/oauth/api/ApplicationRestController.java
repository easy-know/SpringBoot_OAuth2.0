package com.oauth.api;

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
public class ApplicationRestController {
    @PostMapping
    public ResponseEntity save() {
        return ResponseEntity.ok().build();
    };
}
