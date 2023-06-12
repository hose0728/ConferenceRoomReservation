package Reservation.ConferenceRoom.repository;

import Reservation.ConferenceRoom.domain.Member;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MemberRepository extends JpaRepository<Member,Long> {
    Member save(Member member);
}
