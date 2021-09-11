package com.oauth.api.auth.dto;

import lombok.*;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;

/**
 * Description :
 *
 * @author leejinho
 * @version 1.0
 */
@Getter
@AllArgsConstructor
@NoArgsConstructor
public class MemberRequestDto {
    private String email;
    private String password;

    public UsernamePasswordAuthenticationToken toAuthentication() {
        return new UsernamePasswordAuthenticationToken(email, password);
    }
}
