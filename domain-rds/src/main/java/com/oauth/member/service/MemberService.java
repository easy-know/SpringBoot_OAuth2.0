package com.oauth.member.service;

import com.oauth.member.dto.MemberDto;
import com.oauth.member.entity.Member;
import com.oauth.member.repository.MemberRepository;
import com.oauth.member.entity.Authority;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

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

    private final MemberRepository memberRepository;

    public Long save(MemberDto memberDto) {
        validateDuplicateMember(memberDto);
        Member member = Member.builder()
                .email(memberDto.getEmail())
                .password(memberDto.getPassword())
                .authority(Authority.MEMBER)
                .build();

        // todo: MapStruct로 변경

        Member savedEntity = memberRepository.save(member);
        return savedEntity.getId();
    }

    private void validateDuplicateMember(MemberDto memberDto) {
        List<Member> findMembers =
                memberRepository.findMembersByEmail(memberDto.getEmail());
        if (!findMembers.isEmpty()) {
            throw new IllegalStateException("이미 존재하는 회원입니다.");
        }
    }
}
