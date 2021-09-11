package com.oauth.token.dto;

import lombok.Getter;
import lombok.NoArgsConstructor;

/**
 * Description :
 *
 * @author leejinho
 * @version 1.0
 */

@Getter
@NoArgsConstructor
public class TokenDto {
    private String accessToken;
    private String refreshToken;
}
