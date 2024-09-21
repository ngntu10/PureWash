package com.purewash.models;


import jakarta.persistence.*;
import org.springframework.data.annotation.Id;
import java.util.Date;

@Entity
public class customerAccountManagement {
        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        private Integer id;

        private Double topUpAmount;
        @Temporal(TemporalType.TIMESTAMP)
        private Date topUpDate;
        private String paymentMethod;

        @ManyToOne
        @JoinColumn(name = "customer_id")
        private customerAccountManagement customer;

        // Getters and Setters
    }
}
