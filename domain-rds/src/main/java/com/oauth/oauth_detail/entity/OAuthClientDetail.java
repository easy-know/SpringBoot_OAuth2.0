package com.oauth.oauth_detail.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.oauth.application.entity.Application;
//import com.oauth.application.entity.RedirectUrl;
import com.oauth.base.BaseEntity;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import java.util.List;

import static javax.persistence.GenerationType.IDENTITY;

/**
 * Description :
 *
 * @author leejinho
 * @version 1.0
 */
@Getter @Setter
@Entity
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class OAuthClientDetail extends BaseEntity {

    @Id @GeneratedValue(strategy = IDENTITY)
    @Column(name = "oauth_client_detail_id", insertable = false, updatable = false)
    private Long id;
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

//    @OneToMany(mappedBy = "oAuthClientDetail")
//    private List<RedirectUrl> redirectUrls;

    @OneToOne(mappedBy = "oAuthClientDetail", fetch = FetchType.LAZY)
    @JsonIgnore
    private Application applicationEntity;

}
