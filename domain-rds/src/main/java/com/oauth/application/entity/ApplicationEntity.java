package com.oauth.application.entity;

import com.oauth.base.BaseEntity;
import com.oauth.oauth.entity.OAuthClientDetailEntity;
import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
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
public class ApplicationEntity extends BaseEntity {

    @Id @GeneratedValue(strategy = IDENTITY)
    @Column(insertable = false, updatable = false)
    private Long id;

    @OneToOne(cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    @JoinColumn(name = "client_id")
    private OAuthClientDetailEntity clientId;

    @OneToMany(mappedBy = "applicationEntity")
    private List<RedirectUrl> redirectUrls;
}
