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
@Table(name = "users")
public class Users extends BaseTransactionDomain {

    @Column(name = "USER_TYPE")
    private String userType;

    @Column(name = "USER_NAME")
    private String userName;

    @Column(name = "USER_EMAIL",unique = true)
    private String email;

    @Column(name = "USER_PHONE")
    private Long phone;

    @Column(name = "USER_STATE")
    private String state;

    @Column(name = "USER_COUNTRY")
    private String country;

    @Column(name = "USER_PINCODE")
    private Long pincode;
}
