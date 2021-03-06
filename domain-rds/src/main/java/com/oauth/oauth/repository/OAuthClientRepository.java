package com.oauth.oauth.repository;

import com.oauth.oauth.entity.OAuthClientDetail;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * Description :
 *
 * @author leejinho
 * @version 1.0
 */
@Repository
public interface OAuthClientRepository extends JpaRepository<OAuthClientDetail, Long> {
}
