package com.purewash.models;


import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.UUID;

@Entity
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "customer_account_management")
public class CustomerAccountManagement {
        @Id
        @GeneratedValue(strategy = GenerationType.UUID)
        @Column(name = "id")
        private UUID id;

        @Column(name = "top_up_amount")
        private Double topUpAmount;

        @Column(name = "payment_method")
        private String paymentMethod;

        @ManyToOne
        @JoinColumn(name = "customer_id")
        private CustomerAccountManagement customer;
}
