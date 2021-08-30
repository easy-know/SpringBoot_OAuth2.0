package com.oauth.entity;

import javax.persistence.Entity;
import javax.persistence.Id;

/**
 * Description :
 *
 * @author leejinho
 * @version 1.0
 */
@Entity
public class OAuthClientDetail {
    @Id
    private String clientId;               //   varchar(256) not null
    private String resourceIds;            //   varchar(256) null,
    private String clientSecret;           //   varchar(256) null,
    private String scope;                  //   varchar(256) null,
    private String authorizedGrantTypes;   //   varchar(256) null,
    private String webServerRedirectUri;   //   varchar(256) null,
    private String authorities;            //   varchar(256) null,
    private Integer accessTokenValidity;   //   int null,
    private Integer refreshTokenValidity;  //   int null,
    private String additionalInformation;  //   varchar(4096) null,
    private String autoapprove;            //   varchar(256) null
}
