package com.oauth.oauth_approvals.repository;

import com.oauth.oauth_approvals.entity.OAuthApprovals;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * Description :
 *
 * @author leejinho
 * @version 1.0
 */
@Repository
public interface OAuthApprovalsRepository extends JpaRepository<OAuthApprovals, Long> {
}
