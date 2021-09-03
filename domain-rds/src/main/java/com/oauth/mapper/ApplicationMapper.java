package com.oauth.mapper;

import com.oauth.application.dto.ApplicationDto;
import com.oauth.application.entity.ApplicationEntity;
import org.mapstruct.Mapper;

/**
 * Description :
 *
 * @author leejinho
 * @version 1.0
 */

@Mapper(componentModel = "spring")
public interface ApplicationMapper extends StructMapper<ApplicationDto, ApplicationEntity> {
}
