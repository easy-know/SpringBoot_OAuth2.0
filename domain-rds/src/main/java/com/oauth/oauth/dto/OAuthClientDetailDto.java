package com.oauth.oauth.dto;

import com.oauth.application.entity.Application;
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
public class OAuthClientDetailDto {
    private String clientId;                  
    private Application applicationEntity;
    private String resourceIds;               
    private String clientSecret;              
    private String scope;                     
    private String authorizedGrantTypes;      
    private String webServerRedirectUri;      
    private String authorities;               
    private Integer accessTokenValiditySeconds;
    private Integer refreshTokenValiditySeconds;
    private String additionalInformation;     
    private Boolean autoapprove;
}
