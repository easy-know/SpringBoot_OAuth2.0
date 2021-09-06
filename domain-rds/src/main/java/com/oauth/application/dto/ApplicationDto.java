package com.oauth.application.dto;

import com.oauth.application.entity.RedirectUrl;
import com.oauth.oauth.entity.OAuthClientDetail;
import lombok.Getter;
import lombok.Setter;
import java.time.LocalDateTime;
import java.util.List;


/**
 * Description :
 *
 * @author leejinho
 * @version 1.0
 */
@Getter
@Setter
public class ApplicationDto {

    private Long id;
    private OAuthClientDetail clientId;
    private List<RedirectUrl> redirectUrls;
    private Long createId;
    private LocalDateTime createDateTime;
    private Long modifyId;
    private LocalDateTime modifyDateTime;
    private Integer useYn;
}
