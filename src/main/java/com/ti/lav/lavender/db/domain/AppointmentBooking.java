package com.ti.lav.lavender.db.domain;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDateTime;
import java.util.List;

//@MappedSuperclass
@Getter
@Setter
@Entity
@Table(name = "appointment_booking")
public class AppointmentBooking extends BaseTransactionDomain {

    @Column(name = "EST_ID")
    private Long estId;

    @Column(name = "STATE_TIME")
    private LocalDateTime startTime;

    @Column(name = "END_TIME")
    private LocalDateTime endTime;

    @Column(name = "NOTES")
    private String notes;

    @Column(name = "TOTAL_PRICE")
    private Double totalPrice;

    @Column(name = "USER_ID")
    private Long userid;


}
