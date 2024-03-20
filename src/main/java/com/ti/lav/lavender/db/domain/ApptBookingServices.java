package com.ti.lav.lavender.db.domain;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.MappedSuperclass;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;

//@MappedSuperclass
@Getter
@Setter
@Entity
@Table(name = "appt_servivices")
public class ApptBookingServices extends BaseTransactionDomain {

    @Column(name = "BOOKING_ID")
    private Long bookingId;                 // Reference of APPTBooking Id

    @Column(name = "EST_SERVICES_ID")
    private Long esId;                      // Reference of  EST Services id

    @Column(name = "EMPLOYEE_ID")
    private Integer employeeId;

    @Column(name = "SALE_PRICE")
    private Double salePrice;
}
