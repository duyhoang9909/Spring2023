package com.eazybytes.beans;


import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

@Component
public class Vehicle {

    private String name = "Toyota";

    public Vehicle() {
        System.out.println("Vehicle been created by Spring");
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

    @Override
    public String toString() {
        return "Vehicle{" +
                "name='" + name + '\'' +
                '}';
    }
}
