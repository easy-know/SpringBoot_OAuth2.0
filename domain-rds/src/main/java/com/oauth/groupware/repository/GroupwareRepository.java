package com.oauth.groupware.repository;

import com.oauth.groupware.dto.GroupwareDto;
import com.oauth.groupware.entity.Groupware;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

/**
 * Description :
 *
 * @author leejinho
 * @version 1.0
 */
@Repository
public interface GroupwareRepository extends JpaRepository<Groupware, String> {
    Optional<GroupwareDto> findByEmail(String email);
}
