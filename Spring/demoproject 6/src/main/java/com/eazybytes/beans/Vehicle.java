package com.eazybytes.beans;


import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

@Component
public class Vehicle {

    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @PostConstruct
    public void initialize() {
        this.name = "Hondauuu";
    }

    @PreDestroy
    public void destroy() {
        System.out.println("Destroy Vehicle Bean");
    }

    public void printHello() {
        System.out.println("Hello from Component Vehicle Bean");
    }
}