package com.ti.lav.lavender.model;

import lombok.*;

import java.util.List;

@Data
public class EstablishmentsDTO extends BaseTransactionDTO{

    private String name;
    private String about;
    private String addressLine1;
    private String addressLine2;
    private String area;
    private String state;
    private String country;
    private String pincode;
    private String geoLocation;

    private List<EstServicesDTO> services; // Reference to parent service

    // Getters and setters
}
