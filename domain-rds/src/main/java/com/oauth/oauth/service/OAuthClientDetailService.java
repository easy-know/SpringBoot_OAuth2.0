package com.oauth.oauth.service;

import com.oauth.oauth.repository.OAuthClientRepository;
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
public class OAuthClientDetailService {

    private final OAuthClientRepository oAuthClientRepository;

}
