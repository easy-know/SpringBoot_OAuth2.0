package com.oauth.member.service;

import com.oauth.mapper.MemberMapper;
import com.oauth.member.dto.MemberDto;
import com.oauth.member.entity.MemberEntity;
import com.oauth.member.repository.MemberRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * Description :
 *
 * @author leejinho
 * @version 1.0
 */
@Service
@Transactional(readOnly = true)
@RequiredArgsConstructor
public class MemberService {

    private final MemberRepository userRepository;
    private final MemberMapper userMapper;

    public Long save(MemberDto userDto) {
        MemberEntity savedEntity = userRepository.save(userMapper.toEntity(userDto));
        return savedEntity.getId();
    }
}
