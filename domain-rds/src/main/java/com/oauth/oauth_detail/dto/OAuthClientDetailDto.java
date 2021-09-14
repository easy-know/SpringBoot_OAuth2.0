package com.oauth.oauth_detail.dto;

import com.oauth.application.entity.Application;
//import com.oauth.application.entity.RedirectUrl;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;

/**
 * Description :
 *
 * @author leejinho
 * @version 1.0
 */
@Getter @Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class OAuthClientDetailDto {
    private Long id;
    private String clientId;                  
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
    //    private List<RedirectUrl> redirectUrls;
    private Application applicationEntity;
}
