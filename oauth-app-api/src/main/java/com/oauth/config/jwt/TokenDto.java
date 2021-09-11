package com.oauth.config.jwt;

/**
 * Description :
 *
 * @author leejinho
 * @version 1.0
 */
import lombok.*;

@Getter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class TokenDto {

    private String grantType;
    private String accessToken;
    private String refreshToken;
    private Long accessTokenExpiresIn;
}