package com.company.app.model;

import lombok.Data;

import javax.persistence.*;

@Entity
@Table(name = "account")
@Data
public class Account {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(user_id = "user_id")
    private int user_id;

    @Column(billing_address = "billing_address")
    private String billing_address;

    @Column(phone_number = "phone_number")
    private String phone_number;

    @Column(zip = "zip")
    private String zip;
}
