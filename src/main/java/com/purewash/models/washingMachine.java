package com.purewash.models;

import jakarta.persistence.*;


@Entity
public class washingMachine {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer machineId;

    private String locationMachine;
    private String statusMachine;

    @ManyToOne
    @JoinColumn(name = "customer_id")
    private customerAccountManagement customer;

    // Getters and Setters


    public Integer getMachineId() {
        return machineId;
    }

    public void setMachineId(Integer machineId) {
        this.machineId = machineId;
    }

    public String getLocationMachine() {
        return locationMachine;
    }

    public void setLocationMachine(String locationMachine) {
        this.locationMachine = locationMachine;
    }

    public String getStatusMachine() {
        return statusMachine;
    }

    public void setStatusMachine(String statusMachine) {
        this.statusMachine = statusMachine;
    }

    public customerAccountManagement getCustomer() {
        return customer;
    }

    public void setCustomer(customerAccountManagement customer) {
        this.customer = customer;
    }
}
