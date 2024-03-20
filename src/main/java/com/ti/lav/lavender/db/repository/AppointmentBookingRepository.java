package com.ti.lav.lavender.db.repository;

import com.ti.lav.lavender.db.domain.AppointmentBooking;
import com.ti.lav.lavender.db.domain.ApptBookingServices;
import com.ti.lav.lavender.db.domain.EstServices;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface AppointmentBookingRepository extends JpaRepository<AppointmentBooking, Long> {
    @Query("SELECT es FROM ApptBookingServices es where bookingId=:appointmentBookingId ")
    List<ApptBookingServices> getApptmentBookingServices(Long appointmentBookingId);
}
