package com.purewash.models;

import jakarta.persistence.*;
import org.springframework.data.annotation.Id;

import java.util.Date;


@Entity
public class payment {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer paymentId;

    private Double amount;
    @Temporal(TemporalType.TIMESTAMP)
    private Date paymentDatetime;
    private String status;

    @ManyToOne
    @JoinColumn(name = "customer_id")
    private customerAccountManagement customer;

    @OneToOne(mappedBy = "payment")
    private usageStrategy usageStrategy;

    //Getter & Setter
    public Integer getPaymentId() {
        return paymentId;
    }

    public void setPaymentId(Integer paymentId) {
        this.paymentId = paymentId;
    }

    public Double getAmount() {
        return amount;
    }

    public void setAmount(Double amount) {
        this.amount = amount;
    }

    public Date getPaymentDatetime() {
        return paymentDatetime;
    }

    public void setPaymentDatetime(Date paymentDatetime) {
        this.paymentDatetime = paymentDatetime;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public customerAccountManagement getCustomer() {
        return customer;
    }

    public void setCustomer(customerAccountManagement customer) {
        this.customer = customer;
    }

    public usageStrategy getUsageStrategy() {
        return usageStrategy;
    }

    public void setUsageStrategy(usageStrategy usageStrategy) {
        this.usageStrategy = usageStrategy;
    }
}
