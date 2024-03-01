package com.ti.lav.lavender.model.domain;

import jakarta.persistence.*;

@Entity
@Table(name = "EST_SERVICES")
public class EstServices {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ES_ID")
    private Long id;

    @ManyToOne
    @JoinColumn(name = "Est_ID", referencedColumnName = "Est_ID")
    private Establishments establishment;

    @Column(name = "ES_NAME")
    private String name;

    @Column(name = "ES_CATEGORY_TYPE")
    private String categoryType;

    @Column(name = "ES_PARENT_ID")
    private String parentId;

    @Column(name = "ES_SALE_PRICE")
    private Double salePrice;

    @Column(name = "ES_MAX_PRICE")
    private Double maxPrice;

    @Column(name = "ES_DISCOUNT_PRICE")
    private Double discountPrice;

    @Column(name = "ES_DISCOUNT_PERCENTAGE")
    private Double discountPercentage;

    @Column(name = "ES_DURATION")
    private Integer duration;

    // Getters and setters
}

