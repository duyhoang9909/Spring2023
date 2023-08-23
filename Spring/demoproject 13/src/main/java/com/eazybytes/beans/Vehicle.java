package com.eazybytes.beans;


import com.eazybytes.services.VehicleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

@Component(value = "vehicleBean")
public class Vehicle {

    private String name = "Honda";
    private final VehicleService vehicleService;

    @Autowired
    public Vehicle(VehicleService vehicleService) {
        this.vehicleService = vehicleService;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void initialize() {
        this.name = "Hondauuu";
    }

    public void destroy() {
        System.out.println("Destroy Vehicle Bean");
    }

    public void printHello() {
        System.out.println("Hello from Component Vehicle Bean");
    }

    public VehicleService getVehicleService() {
        return vehicleService;
    }

    @Override
    public String toString() {
        return "Vehicle{" +
                "name='" + name + '\'' +
                '}';
    }
}
