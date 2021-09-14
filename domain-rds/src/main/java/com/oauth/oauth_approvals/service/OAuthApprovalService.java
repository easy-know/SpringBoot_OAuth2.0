package com.oauth.oauth_approvals.service;

import com.oauth.oauth_approvals.dto.OAuthApprovalsDto;
import com.oauth.oauth_approvals.entity.OAuthApprovals;
import com.oauth.oauth_approvals.repository.OAuthApprovalsRepository;
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
public class OAuthApprovalService {
    private final OAuthApprovalsRepository oAuthApprovalsRepository;

    public Long save(OAuthApprovalsDto oAuthApprovalsDto) {

        OAuthApprovals oAuthApprovals = OAuthApprovals.builder()
                .userId(oAuthApprovalsDto.getUserId())
                .clientId(oAuthApprovalsDto.getClientId())
                .build();

        return oAuthApprovalsRepository.save(oAuthApprovals).getId();
    }
}
