package com.ti.lav.lavender.model.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class EstSearchCriteriaDTO {

    private String serviceName;
    private Double minSalePrice;
    private Double maxSalePrice;
    private Integer minDuration;
    private Integer maxDuration;

    // Constructors, getters, and setters
}
