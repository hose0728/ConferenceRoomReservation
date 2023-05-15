package Reservation.ConferenceRoom.domain;

import Reservation.ConferenceRoom.domain.common.BaseEntity;
import jakarta.persistence.*;

@Entity
public class Reservation extends BaseEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "member_id", nullable = false)
    private Member member;
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "room_id", nullable = false)
    private Room room;
    private String title;

    private String desc;

}
