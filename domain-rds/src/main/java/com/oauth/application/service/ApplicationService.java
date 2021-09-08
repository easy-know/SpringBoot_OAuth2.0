package com.oauth.application.service;

import com.oauth.application.dto.ApplicationDto;
import com.oauth.application.entity.Application;
import com.oauth.application.repository.ApplicationRepository;
import com.oauth.oauth.entity.OAuthClientDetail;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.UUID;

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

    public List<Application> loadAll() {
        return applicationRepository.findAll();
    }

    @Transactional
    public String save(ApplicationDto applicationDto) {
        UUID clientId = UUID.randomUUID();
        UUID clientSecret = UUID.randomUUID();

        OAuthClientDetail oAuthClientDetail = OAuthClientDetail.builder()
                .clientId(clientId.toString())
                .clientSecret(clientSecret.toString())
                .build();

        Application application = Application.builder()
                .name(applicationDto.getName())
                .company(applicationDto.getCompany())
                .clientId(oAuthClientDetail)
                .build();

        Application savedApp = applicationRepository.save(application);

        return savedApp.getName();
    }

}
