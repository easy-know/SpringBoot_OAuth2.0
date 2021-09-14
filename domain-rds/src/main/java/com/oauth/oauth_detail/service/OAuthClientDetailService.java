package com.oauth.oauth_detail.service;

import com.oauth.oauth_detail.dto.OAuthClientDetailDto;
import com.oauth.oauth_detail.entity.OAuthClientDetail;
import com.oauth.oauth_detail.repository.OAuthClientRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.Optional;

/**
 * Description :
 *
 * @author leejinho
 * @version 1.0
 */
@Service
@Transactional(readOnly = true)
@RequiredArgsConstructor
public class OAuthClientDetailService {

    private final OAuthClientRepository oAuthClientRepository;

    public OAuthClientDetailDto loadDetail(String clientId) {
        OAuthClientDetail oAuthClientDetail = oAuthClientRepository.findByClientId(clientId).get();

        OAuthClientDetailDto oAuthClientDetailDto = OAuthClientDetailDto.builder()
                .id(oAuthClientDetail.getId())
                .clientId(oAuthClientDetail.getClientId())
                .clientSecret(oAuthClientDetail.getClientSecret())
                .webServerRedirectUri(oAuthClientDetail.getWebServerRedirectUri())
                .build();

        return oAuthClientDetailDto;
    }

    @Transactional
    public String saveRedirectUrl(Long id, String redirectUrl) {
        Optional<OAuthClientDetail> oAuthClientDetail = oAuthClientRepository.findById(id);
        OAuthClientDetail clientDetail = null;

        if (oAuthClientDetail.isPresent()) {
            clientDetail = oAuthClientDetail.get();
            clientDetail.setWebServerRedirectUri(redirectUrl);
        }

        return clientDetail.getClientId();
    }
}
