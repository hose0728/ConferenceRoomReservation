package Reservation.ConferenceRoom.service;

import Reservation.ConferenceRoom.domain.Member;
import Reservation.ConferenceRoom.repository.MemberRepository;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;


@Transactional
public class MemberService {
    private final MemberRepository memberRepository;

    public MemberService(MemberRepository memberRepository) {

        this.memberRepository = memberRepository;
    }

    /**
     * 회원 가입
     */
    public Long join(Member member){
        // 같은 이름이 있는 중복 회원X
        //validateDuplicateMember(member); //중복회원 검증

        memberRepository.save(member);
        return member.getId();
    }


}
