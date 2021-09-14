package com.oauth.groupware.entity;

import com.oauth.base.BaseEntity;
import com.oauth.member.entity.Role;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.DynamicInsert;
import org.hibernate.annotations.DynamicUpdate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

import static javax.persistence.GenerationType.IDENTITY;

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
@DynamicInsert
@DynamicUpdate
public class Groupware extends BaseEntity {
    @Id @GeneratedValue(strategy = IDENTITY)
    @Column(name = "groupware_id", insertable = false, updatable = false)
    private Long id;
    private String empno;
    private String email;
    private String password;
    private String name;
    private String birth;
    private String cellphone;
    @Enumerated(EnumType.STRING)
    private Role authority;
}
