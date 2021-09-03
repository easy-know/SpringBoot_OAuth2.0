package com.oauth.mapper;

import com.oauth.application.dto.ApplicationDto;
import com.oauth.application.entity.ApplicationEntity;
import com.oauth.oauth.dto.OAuthClientDetailDto;
import com.oauth.oauth.entity.OAuthClientDetailEntity;
import org.mapstruct.Mapper;

/**
 * Description :
 *
 * @author leejinho
 * @version 1.0
 */

@Mapper(componentModel = "spring")
public interface OAuthClientDetailMapper extends StructMapper<OAuthClientDetailDto, OAuthClientDetailEntity> {
}
