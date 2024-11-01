package com.purewash.models;


import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

@Entity
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "customer")
public class Customer {
    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    @Column(name = "id")
    private UUID id;

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
    private List<WashingMachine> washingMachines;

    @OneToMany(mappedBy = "customer", cascade = CascadeType.ALL)
    private List<CustomerAccountManagement> customerAccountManagements ;

    @OneToMany(mappedBy = "customer", cascade = CascadeType.ALL)
    private List<TransactionHistory> transactionHistories ;

    @OneToMany(mappedBy = "customer", cascade = CascadeType.ALL)
    private List<Payment> payments;

    @OneToMany(mappedBy = "customer", cascade = CascadeType.ALL)
    private List<Order> orderList;

}