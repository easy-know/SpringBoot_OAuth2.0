package com.oauth.member.dto;

import com.oauth.member.entity.Role;
import com.oauth.member.entity.Member;
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
@Getter
@Setter
@NoArgsConstructor
public class MemberDto {
    private Long id;
    private String email;
    private String password;
    private Role authority;

    @Builder
    public MemberDto(String username, String password, String email, Role role) {
        this.email = email;
        this.password = password;
        this.authority = role;
    }

    public Member toEntity() {
        return Member.builder()
                .email(email)
                .password(password)
                .authority(authority).build();
    }
}
