package com.oauth.application.repository;

import com.oauth.application.entity.Application;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * Description :
 *
 * @author leejinho
 * @version 1.0
 */
@Repository
public interface ApplicationRepository extends JpaRepository<Application, Long> {
}
