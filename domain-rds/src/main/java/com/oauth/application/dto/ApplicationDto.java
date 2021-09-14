package com.oauth.application.dto;

//import com.oauth.application.entity.RedirectUrl;

import com.oauth.member.entity.Member;
import com.oauth.oauth_detail.entity.OAuthClientDetail;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;


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
public class ApplicationDto {
    private Long id;
    private String name;
    private String company;
    private String clientId;
    private String redirectUrls;
    private OAuthClientDetail oAuthClientDetail;
    private Member member;
//    private List<RedirectUrl> redirectUrls;
}
