package com.oauth.groupware.dto;

import com.oauth.member.entity.Role;
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
public class GroupwareDto {
    private String empno;
    private String email;
    private String password;
    private String name;
    private String birth;
    private String cellphone;
    private Role authority;
}
