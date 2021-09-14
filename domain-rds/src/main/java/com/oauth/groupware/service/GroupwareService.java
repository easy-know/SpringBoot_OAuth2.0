package com.oauth.groupware.service;

import com.oauth.groupware.dto.GroupwareDto;
import com.oauth.groupware.repository.GroupwareRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.Optional;

/**
 * Description :
 *
 * @author leejinho
 * @version 1.0
 */
@Service
@RequiredArgsConstructor
@Transactional(readOnly = true)
public class GroupwareService {

    private final GroupwareRepository groupwareRepository;

    public String loginGroupware(String email, String password) {
        Optional<GroupwareDto> optional = groupwareRepository.findByEmail(email);

        if (optional.isPresent()) {
            if (optional.get().getPassword().equals(password)) {
                return email;
            }
        }

        return email;
    }
}
