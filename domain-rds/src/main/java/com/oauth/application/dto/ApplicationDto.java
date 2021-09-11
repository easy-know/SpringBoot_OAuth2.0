package com.oauth.application.dto;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.oauth.application.entity.RedirectUrl;
import com.oauth.member.entity.Member;
import com.oauth.oauth_detail.entity.OAuthClientDetail;
import lombok.Getter;
import lombok.Setter;

import java.util.List;


/**
 * Description :
 *
 * @author leejinho
 * @version 1.0
 */
@Getter
@Setter
public class ApplicationDto {

    private Long id;
    private String name;
    private String company;
    private OAuthClientDetail clientId;
    private Member member;
    private List<RedirectUrl> redirectUrls;
}
