package com.purewash.models;


import jakarta.persistence.*;
import org.springframework.boot.autoconfigure.pulsar.PulsarProperties;
import org.springframework.data.annotation.Id;

import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "customer")
public class customerEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "customer_id")
    private Integer customerId;

    @Column(name = "customer_number")
    private Integer customerNumber;

    @Column(name = "name", length = 255)
    private String name;

    @Column(name = "phone")
    private Integer phone;

    @Column(name = "password", length = 255)
    private String password;

    @Column(name = "account_balance", precision = 10, scale = 2)
    private Double accountBalance;

    @OneToMany(mappedBy = "customer", cascade = CascadeType.ALL)
    private List<washingMachine> washingMachines = new ArrayList<>();

    @OneToMany(mappedBy = "customer", cascade = CascadeType.ALL)
    private List<customerAccountManagement> customerAccountManagements = new ArrayList<>();

    @OneToMany(mappedBy = "customer", cascade = CascadeType.ALL)
    private List<transactionHistory> transactionHistories = new ArrayList<>();

    @OneToMany(mappedBy = "customer", cascade = CascadeType.ALL)
    private List<payment> payments = new ArrayList<>();

    @OneToMany(mappedBy = "customer", cascade = CascadeType.ALL)
    private List<usageStrrategy> usageStrategies = new ArrayList<>();

// Getters and Setters


    public Integer getCustomerId() {
        return customerId;
    }

    public void setCustomerId(Integer customerId) {
        this.customerId = customerId;
    }

    public Integer getCustomerNumber() {
        return customerNumber;
    }

    public void setCustomerNumber(Integer customerNumber) {
        this.customerNumber = customerNumber;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getPhone() {
        return phone;
    }

    public void setPhone(Integer phone) {
        this.phone = phone;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Double getAccountBalance() {
        return accountBalance;
    }

    public void setAccountBalance(Double accountBalance) {
        this.accountBalance = accountBalance;
    }

    public List<washingMachine> getWashingMachines() {
        return washingMachines;
    }

    public void setWashingMachines(List<washingMachine> washingMachines) {
        this.washingMachines = washingMachines;
    }

    public List<customerAccountManagement> getCustomerAccountManagements() {
        return customerAccountManagements;
    }

    public void setCustomerAccountManagements(List<customerAccountManagement> customerAccountManagements) {
        this.customerAccountManagements = customerAccountManagements;
    }

    public List<transactionHistory> getTransactionHistories() {
        return transactionHistories;
    }

    public void setTransactionHistories(List<transactionHistory> transactionHistories) {
        this.transactionHistories = transactionHistories;
    }

    public List<payment> getPayments() {
        return payments;
    }

    public void setPayments(List<payment> payments) {
        this.payments = payments;
    }

    public List<usageStrrategy> getUsageStrategies() {
        return usageStrategies;
    }

    public void setUsageStrategies(List<usageStrrategy> usageStrategies) {
        this.usageStrategies = usageStrategies;
    }
}