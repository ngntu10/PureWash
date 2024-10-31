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
@Table(name = "subcription")
public class Subcription {
    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    @Column(name = "id")
    private UUID id;

    @Column(name = "subscription_name")
    private String subscriptionName;

    @Column(name = "price")
    private Double price;

    @Column(name = "duration_time")
    private Integer durationTime;

    @OneToMany(mappedBy = "subscription", cascade = CascadeType.ALL)
    private List<UsageStrategy> usageStrategies;

}
