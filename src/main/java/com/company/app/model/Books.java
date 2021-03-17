package com.company.app.model;

import lombok.Data;

import javax.persistence.*;

@Entity
@Table(name = "books")
@Data
public class Books {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(account_id = "account_id")
    private int account_id;
}
