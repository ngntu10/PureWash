package com.purewash.models;

import jakarta.persistence.*;
import org.springframework.data.annotation.Id;
import java.util.Date;
////test
@Entity
public class transactionHistory {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer transactionId;

    @Column(name = "transactionType")
    private String transactionType;
    private Double amount;
    @Temporal(TemporalType.TIMESTAMP)
    private Date transactionDate;

    @ManyToOne
    @JoinColumn(name = "customer_id")
    private customerAccountManagement customer;

    // Getters and Setters

    public Integer getTransactionId() {
        return transactionId;
    }

    public void setTransactionId(Integer transactionId) {
        this.transactionId = transactionId;
    }

    public String getTransactionType() {
        return transactionType;
    }

    public void setTransactionType(String transactionType) {
        this.transactionType = transactionType;
    }

    public Double getAmount() {
        return amount;
    }

    public void setAmount(Double amount) {
        this.amount = amount;
    }

    public Date getTransactionDate() {
        return transactionDate;
    }

    public void setTransactionDate(Date transactionDate) {
        this.transactionDate = transactionDate;
    }

    public customerAccountManagement getCustomer() {
        return customer;
    }

    public void setCustomer(customerAccountManagement customer) {
        this.customer = customer;
    }
}
