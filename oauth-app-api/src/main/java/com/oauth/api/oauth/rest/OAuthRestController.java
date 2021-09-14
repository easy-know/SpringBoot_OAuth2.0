package com.oauth.api.oauth.rest;

import com.oauth.oauth_detail.dto.OAuthClientDetailDto;
import com.oauth.oauth_detail.service.OAuthClientDetailService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
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
@RequiredArgsConstructor
@RequestMapping("/api/oauth-detail")
public class OAuthRestController {

    private final OAuthClientDetailService oAuthClientDetailService;

    @PostMapping("redirect")
    public ResponseEntity saveRedirect(@RequestBody OAuthClientDetailDto oAuthClientDetailDto) {
        log.info("saveRedirect(): " + oAuthClientDetailDto.getWebServerRedirectUri());

        return ResponseEntity.ok(oAuthClientDetailService.saveRedirectUrl(oAuthClientDetailDto.getId(), oAuthClientDetailDto.getWebServerRedirectUri()));
    }

    @GetMapping("{clientId}")
    public ResponseEntity loadDetail(@PathVariable("clientId") String clientId) {
        log.info("loadDetail(): " + clientId);

        return ResponseEntity.ok(oAuthClientDetailService.loadDetail(clientId));
    }
}
