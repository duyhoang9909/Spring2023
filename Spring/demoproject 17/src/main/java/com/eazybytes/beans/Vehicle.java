package com.eazybytes.beans;


import com.eazybytes.services.VehicleServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component(value = "vehicleBean")
public class Vehicle {

    private String name = "Honda";
    private final VehicleServices vehicleServices;

    @Autowired
    public Vehicle(VehicleServices vehicleServices) {
        this.vehicleServices = vehicleServices;
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

    public VehicleServices getVehicleService() {
        return vehicleServices;
    }

    @Override
    public String toString() {
        return "Vehicle{" +
                "name='" + name + '\'' +
                '}';
    }
}
