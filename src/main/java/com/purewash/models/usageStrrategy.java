package com.purewash.models;

import jakarta.persistence.*;
import org.springframework.data.annotation.Id;

import java.util.Date;


@Entity
@Table
public class usageStrrategy {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer usageId;

    @Temporal(TemporalType.TIMESTAMP)
    private Date startTime;
    @Temporal(TemporalType.TIMESTAMP)
    private Date endTime;
    private String status;

    @ManyToOne
    @JoinColumn(name = "customer_id")
    private customerAccountManagement customer;

    @ManyToOne
    @JoinColumn(name = "machine_id")
    private washingMachine washingMachine;

    @ManyToOne
    @JoinColumn(name = "subscription_id")
    private subcription subscription;

    @OneToOne
    @JoinColumn(name = "payment_id")
    private payment payment;


    //Getter & Setter


    public Integer getUsageId() {
        return usageId;
    }

    public void setUsageId(Integer usageId) {
        this.usageId = usageId;
    }

    public Date getStartTime() {
        return startTime;
    }

    public void setStartTime(Date startTime) {
        this.startTime = startTime;
    }

    public Date getEndTime() {
        return endTime;
    }

    public void setEndTime(Date endTime) {
        this.endTime = endTime;
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

    public com.purewash.models.washingMachine getWashingMachine() {
        return washingMachine;
    }

    public void setWashingMachine(com.purewash.models.washingMachine washingMachine) {
        this.washingMachine = washingMachine;
    }

    public subcription getSubscription() {
        return subscription;
    }

    public void setSubscription(subcription subscription) {
        this.subscription = subscription;
    }

    public com.purewash.models.payment getPayment() {
        return payment;
    }

    public void setPayment(com.purewash.models.payment payment) {
        this.payment = payment;
    }
}
