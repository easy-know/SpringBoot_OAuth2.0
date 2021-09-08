package com.oauth.member.entity;

import lombok.AllArgsConstructor;
import lombok.Getter;

/**
 * Description :
 *
 * @author leejinho
 * @version 1.0
 */
@AllArgsConstructor
@Getter
public enum Role {
    ADMIN("ROLE_ADMIN"),
    MEMBER("ROLE_MEMBER");

    private String value;
}
