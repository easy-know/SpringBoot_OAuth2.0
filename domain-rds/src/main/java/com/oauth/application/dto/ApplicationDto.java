package com.oauth.application.dto;

import com.oauth.application.entity.RedirectUrl;
import com.oauth.member.entity.Member;
import com.oauth.oauth.entity.OAuthClientDetail;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import java.time.LocalDateTime;
import java.util.List;

import static javax.persistence.GenerationType.IDENTITY;


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
