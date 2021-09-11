package com.oauth.member.service;

import com.oauth.member.dto.MemberDto;
import com.oauth.member.entity.Member;
import com.oauth.member.repository.MemberRepository;
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

    public Long signup(MemberDto memberDto) {
        validateDuplicateMember(memberDto);

        // todo: MapStruct로 변경

        return memberRepository.save(memberDto.toEntity()).getId();
    }

    private void validateDuplicateMember(MemberDto memberDto) {
        List<Member> findMembers =
                memberRepository.findMembersByEmail(memberDto.getEmail());
        if (!findMembers.isEmpty()) {
            throw new IllegalStateException("이미 존재하는 회원입니다.");
        }
    }
}
