package com.oauth.application.service;

import com.oauth.application.dto.ApplicationDto;
import com.oauth.application.entity.Application;
import com.oauth.application.repository.ApplicationRepository;
import com.oauth.member.entity.Role;
import com.oauth.oauth_detail.entity.OAuthClientDetail;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.UUID;
import java.util.stream.Collectors;

/**
 * Description :
 *
 * @author leejinho
 * @version 1.0
 */
@Service
@Transactional(readOnly = true)
@RequiredArgsConstructor
public class ApplicationService {

    private final ApplicationRepository applicationRepository;
    private static final long ACCESS_TOKEN_EXPIRE_TIME = 1000 * 60 * 30 * 2;            // 1h
    private static final long REFRESH_TOKEN_EXPIRE_TIME = 1000 * 60 * 60 * 24 * 7;  // 7d

    public List<ApplicationDto> loadAll() {
        List<Application> applicationList = applicationRepository.findAll(Sort.by(Sort.Direction.DESC, "id"));

        List<ApplicationDto> applicationDtoList = applicationList.stream()
                .map(m -> ApplicationDto.builder()
                        .id(m.getId())
                        .name(m.getName())
                        .company(m.getCompany())
                        .clientId(m.getClientId())
                        .build())
                .collect(Collectors.toList());

        return applicationDtoList;
    }

    public ApplicationDto loadDetail(String name) {
        Application application = applicationRepository.findByName(name).get();

        ApplicationDto applicationDto = ApplicationDto.builder()
                .id(application.getId())
                .name(application.getName())
                .company(application.getCompany())
                .clientId(application.getClientId())
                .build();

        return applicationDto;
    }

    @Transactional
    public String save(ApplicationDto applicationDto, String clientSecret) {
        UUID clientId = UUID.randomUUID();

        OAuthClientDetail oAuthClientDetail = OAuthClientDetail.builder()
                .clientId(clientId.toString())
                .clientSecret(clientSecret)
                .accessTokenValiditySeconds(Long.valueOf(ACCESS_TOKEN_EXPIRE_TIME).intValue())
                .refreshTokenValiditySeconds(Long.valueOf(REFRESH_TOKEN_EXPIRE_TIME).intValue())
                .authorities(Role.ROLE_USER.name())
                .authorizedGrantTypes("authorization_code,refresh_token")
                .build();

        Application application = Application.builder()
                .name(applicationDto.getName())
                .company(applicationDto.getCompany())
                .clientId(clientId.toString())
                .oAuthClientDetail(oAuthClientDetail)
                .build();

        return applicationRepository.save(application).getName();
    }

}
