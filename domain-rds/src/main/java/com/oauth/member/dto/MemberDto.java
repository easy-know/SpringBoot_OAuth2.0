package com.oauth.member.dto;

import com.oauth.role.Authority;
import lombok.Getter;
import lombok.Setter;

/**
 * Description :
 *
 * @author leejinho
 * @version 1.0
 */
@Getter
@Setter
public class MemberDto {
    private Long id;
    private String email;
    private String password;
    private Authority authority;
}
