package com.ti.lav.lavender.model;

import lombok.Data;

@Data
public class UsersDTO extends BaseTransactionDTO {
    private String userType;
    private String userName;
    private String email;
    private Long phone;
    private String state;
    private String country;
    private Long pincode;
}
