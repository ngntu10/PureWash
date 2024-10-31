package com.purewash.models;

import jakarta.persistence.*;

import java.util.Date;
import java.util.UUID;

////test
@Entity
public class TransactionHistory {
    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    @Column(name = "id")
    private UUID id;

    @Column(name = "transactionType")
    private String transactionType;

    @Column(name = "amount")
    private Double amount;
    @Temporal(TemporalType.TIMESTAMP)
    @Column(name = "transaction_date")
    private Date transactionDate;

    @ManyToOne
    @JoinColumn(name = "customer_id")
    private CustomerAccountManagement customer;

}
