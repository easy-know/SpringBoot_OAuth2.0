package com.oauth.oauth_approvals.dto;

import lombok.Getter;
import lombok.Setter;

/**
 * Description :
 *
 * @author leejinho
 * @version 1.0
 */
@Getter
@Setter
public class OAuthApprovalsDto {
    private Long id;
    private String userId;
    private String clientId;
    private String scope;
    private String expiredAt;
}
