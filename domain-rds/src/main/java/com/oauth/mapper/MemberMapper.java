package com.oauth.mapper;

import com.oauth.member.dto.MemberDto;
import com.oauth.member.entity.MemberEntity;
import org.mapstruct.Mapper;

/**
 * Description :
 *
 * @author leejinho
 * @version 1.0
 */

@Mapper(componentModel = "spring")
public interface MemberMapper extends StructMapper<MemberDto, MemberEntity> {
}
