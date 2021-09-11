package com.oauth.application.repository;

import com.oauth.application.entity.Application;
import org.springframework.data.domain.Sort;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

/**
 * Description :
 *
 * @author leejinho
 * @version 1.0
 */
@Repository
public interface ApplicationRepository extends JpaRepository<Application, Long> {
    List<Application> findAllByMemberIs(Long id, Sort sort);
    Optional<Application> findByName(String name);
}
