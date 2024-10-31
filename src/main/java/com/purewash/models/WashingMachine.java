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
@Table(name = "washing_machine")
public class WashingMachine {
    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    @Column(name = "id")
    private UUID id;

    @Column(name = "location_machine")
    private String locationMachine;

    @Column(name = "status_machine")
    private String statusMachine;

    @ManyToOne
    @JoinColumn(name = "customer_id")
    private CustomerAccountManagement customer;

}
