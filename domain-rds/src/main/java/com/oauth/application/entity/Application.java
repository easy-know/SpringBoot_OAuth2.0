package com.oauth.application.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.oauth.base.BaseEntity;
import com.oauth.member.entity.Member;
import com.oauth.oauth_detail.entity.OAuthClientDetail;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.DynamicInsert;
import org.hibernate.annotations.DynamicUpdate;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
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
@Entity
@Getter
@Builder
@NoArgsConstructor
@AllArgsConstructor
@DynamicInsert
@DynamicUpdate
public class Application extends BaseEntity {

    @Id @GeneratedValue(strategy = IDENTITY)
    @Column(insertable = false, updatable = false)
    private Long id;

    private String name;

    private String company;

    private String clientId;

    @OneToOne(cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    @JoinColumn(name = "oauth_client_detail_id")
    @JsonIgnore
    private OAuthClientDetail oAuthClientDetail;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "member_id")
    private Member member;

}
