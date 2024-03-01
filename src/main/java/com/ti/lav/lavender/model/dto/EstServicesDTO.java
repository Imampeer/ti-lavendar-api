package com.ti.lav.lavender.model.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.math.BigDecimal;
import java.util.List;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class EstServicesDTO {

    private Long id;
    private Long establishmentId;
    private String name;
    private String categoryType;
    private Long parentId; // Reference to parent service
    private BigDecimal salePrice;
    private BigDecimal maxPrice;
    private BigDecimal discountPrice;
    private BigDecimal discountPercentage;
    private Integer duration;
    //private List<EstServicesDTO> childService; // Reference to parent service
}
