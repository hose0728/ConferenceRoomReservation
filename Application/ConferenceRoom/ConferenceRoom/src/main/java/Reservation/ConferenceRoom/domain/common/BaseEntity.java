package Reservation.ConferenceRoom.domain.common;

import jakarta.persistence.Column;
import jakarta.persistence.EntityListeners;
import jakarta.persistence.MappedSuperclass;
import lombok.Getter;
import org.hibernate.annotations.ColumnDefault;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedDate;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;
import java.time.LocalDateTime;
import java.util.Objects;

@Getter
@EntityListeners(AuditingEntityListener.class)
@MappedSuperclass
public abstract class BaseEntity {

    @CreatedDate
    @ColumnDefault("current_timestamp()")
    @Column(name = "create_date")
    private LocalDateTime createDate;

    @LastModifiedDate
    @ColumnDefault("current_timestamp()")
    @Column(name = "update_date")
    private LocalDateTime updateDate;

    protected void validateString(final String value, final String name) {
        if (Objects.isNull(value) || value.isEmpty()) {
            throw new IllegalArgumentException(String.format("%s is required", name));
        }
    }

    protected void validateObject(final Object value, final String name) {
        if (Objects.isNull(value)) {
            throw new IllegalArgumentException(String.format("%s is required", name));
        }
    }
}
