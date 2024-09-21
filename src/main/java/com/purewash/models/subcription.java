package com.purewash.models;


import jakarta.persistence.*;
import org.springframework.data.annotation.Id;

import java.util.ArrayList;
import java.util.List;

@@Entity
public class subcription {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer subscriptionId;

    private String subscriptionName;
    private Double price;
    private Integer durationTime;

    @OneToMany(mappedBy = "subscription", cascade = CascadeType.ALL)
    private List<usageStrrategy> usageStrategies = new ArrayList<>();

    //Getter & Setter

    public Integer getSubscriptionId() {
        return subscriptionId;
    }

    public void setSubscriptionId(Integer subscriptionId) {
        this.subscriptionId = subscriptionId;
    }

    public String getSubscriptionName() {
        return subscriptionName;
    }

    public void setSubscriptionName(String subscriptionName) {
        this.subscriptionName = subscriptionName;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public Integer getDurationTime() {
        return durationTime;
    }

    public void setDurationTime(Integer durationTime) {
        this.durationTime = durationTime;
    }

    public List<usageStrrategy> getUsageStrategies() {
        return usageStrategies;
    }

    public void setUsageStrategies(List<usageStrrategy> usageStrategies) {
        this.usageStrategies = usageStrategies;
    }
}
