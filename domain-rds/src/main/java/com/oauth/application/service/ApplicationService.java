package com.oauth.application.service;

import com.oauth.application.dto.ApplicationDto;
import com.oauth.application.entity.ApplicationEntity;
import com.oauth.application.repository.ApplicationRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

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

    @Transactional
    public String save(ApplicationDto applicationDto) {
//        ApplicationEntity save = applicationRepository.save(applicationMapper.toEntity(applicationDto));
//        return save.getClientId().toString();
        return null;
    }

}
