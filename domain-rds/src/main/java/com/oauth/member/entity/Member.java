package com.oauth.member.entity;

import com.oauth.application.entity.Application;
import com.oauth.base.BaseEntity;
import com.oauth.role.Authority;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
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
@Getter
@Entity
@NoArgsConstructor
@AllArgsConstructor
public class Member extends BaseEntity {

    @Id @GeneratedValue(strategy = IDENTITY)
    @Column(insertable = false, updatable = false)
    private Long id;

    private String email;

    private String password;

    @Enumerated(EnumType.STRING)
    private Authority authority;

    @OneToMany(mappedBy = "member")
    private List<Application> applicationList;

}
