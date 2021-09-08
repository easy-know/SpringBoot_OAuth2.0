package com.oauth.security;

import com.oauth.member.entity.Role;
import com.oauth.member.entity.Member;
import lombok.Getter;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.User;

import java.util.Collection;
import java.util.Collections;

/**
 * Description :
 *
 * @author leejinho
 * @version 1.0
 */
@Getter
public class AccountContext extends User {
    private final Member member;

    public AccountContext(Member member) {
        super(member.getEmail(), member.getPassword(), getAuthorities(member.getAuthority()));
        this.member = member;
    }

    private static Collection<? extends GrantedAuthority> getAuthorities(Role role) {
        return Collections.singleton(new SimpleGrantedAuthority(role.getValue()));
    }
}
