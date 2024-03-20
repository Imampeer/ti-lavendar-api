package com.ti.lav.lavender.model;

import lombok.Data;

import java.time.LocalDateTime;
import java.util.List;

@Data
public class AppointmentBookingDTO extends BaseTransactionDTO {
    private Long estId;
    private LocalDateTime startTime;
    private LocalDateTime endTime;
    private String notes;
    private Double totalPrice;
    private Long userid;
      private List<ApptBookingServicesDTO> services; // Reference to parent service
    //  Getter & Setter
}
