package com.ti.lav.lavender.model.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class EstablishmentsDTO {

    private Long id;
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
