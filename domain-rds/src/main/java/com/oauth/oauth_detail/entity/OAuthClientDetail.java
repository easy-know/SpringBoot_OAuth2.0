package com.oauth.oauth_detail.entity;

import com.oauth.application.entity.Application;
import com.oauth.application.entity.RedirectUrl;
import com.oauth.base.BaseEntity;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import java.util.List;

/**
 * Description :
 *
 * @author leejinho
 * @version 1.0
 */
@Getter
@Entity
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class OAuthClientDetail extends BaseEntity {
    @Id
    @Column(name = "client_id")
    private String clientId;               //   varchar(256) not null
    private String clientSecret;           //   varchar(256) null,
    private String scope;                  //   varchar(256) null,
    private String authorizedGrantTypes;   //   varchar(256) null,
    private String webServerRedirectUri;   //   varchar(256) null,
    private String authorities;            //   varchar(256) null,
    private Integer accessTokenValiditySeconds;   //   int null,
    private Integer refreshTokenValiditySeconds;  //   int null,
    private String additionalInformation;  //   varchar(4096) null,
    private Boolean autoApprove;            //   varchar(256) null

    @OneToOne(mappedBy = "clientId", fetch = FetchType.LAZY)
    private Application applicationEntity;

    @OneToMany(mappedBy = "oAuthClientDetail")
    private List<RedirectUrl> redirectUrls;
}
