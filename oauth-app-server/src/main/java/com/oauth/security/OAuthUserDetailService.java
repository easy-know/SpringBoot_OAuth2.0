package com.oauth.security;

import com.oauth.groupware.dto.GroupwareDto;
import com.oauth.groupware.repository.GroupwareRepository;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.security.authentication.AccountStatusUserDetailsChecker;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.Collections;

/**
 * Description :
 *
 * @author leejinho
 * @version 1.0
 */
@Slf4j
@Service
@RequiredArgsConstructor
public class OAuthUserDetailService implements UserDetailsService {

    private final GroupwareRepository groupwareRepository;
    private final AccountStatusUserDetailsChecker detailsChecker = new AccountStatusUserDetailsChecker();

    @Override
    @Transactional
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        log.info("CustomUserDetailsService - loadUserByUsername() : " + username);
        return groupwareRepository.findByEmail(username)
                .map(this::createUserDetails)
                .orElseThrow(() -> new UsernameNotFoundException(username + " -> 데이터베이스에서 찾을 수 없습니다."));
    }

    // DB 에 User 값이 존재한다면 UserDetails 객체로 만들어서 리턴
    private UserDetails createUserDetails(GroupwareDto groupware) {
        log.info("CustomUserDetailsService - createUserDetails() : " + groupware.getEmail());
        GrantedAuthority grantedAuthority = new SimpleGrantedAuthority(groupware.getAuthority().toString());

        User user = new User(String.valueOf(groupware.getEmail()),
                groupware.getPassword(),
                Collections.singleton(grantedAuthority));

        detailsChecker.check(user);

        return user;
    }
}
