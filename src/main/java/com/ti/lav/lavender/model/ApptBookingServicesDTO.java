package com.ti.lav.lavender.model;

import lombok.Data;

@Data
public class ApptBookingServicesDTO extends BaseTransactionDTO {

    private Long bookingId;  // Reference of APPTBookingId
    private Long esId;       // Reference of EST Services id
    private Integer employeeId;
    private Double salePrice;

}
