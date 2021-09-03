package com.oauth.base;

import lombok.Getter;
import lombok.Setter;
import org.hibernate.annotations.ColumnDefault;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedDate;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import javax.persistence.Column;
import javax.persistence.EntityListeners;
import javax.persistence.MappedSuperclass;
import java.time.LocalDateTime;

/**
 * <pre>
 * com.blogcode.base
 *
 * Description :
 * </pre>
 *
 */
@MappedSuperclass
@Setter @Getter
@EntityListeners(AuditingEntityListener.class)
public class BaseEntity {
    @Column(name="CREATE_ID", updatable = false)
    protected Long createId;

    @CreatedDate
    @Column(name="CREATE_DATE_TIME", updatable = false)
    private LocalDateTime createDateTime;

    @Column(name="MODIFY_ID")
    protected Long modifyId;

    @LastModifiedDate
    @Column(name="MODIFY_DATE_TIME")
    private LocalDateTime modifyDateTime;

    @Column
    @ColumnDefault("1")
    private Integer useYn;
}
