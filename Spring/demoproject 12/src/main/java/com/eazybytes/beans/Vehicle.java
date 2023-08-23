package com.eazybytes.beans;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;


public class Vehicle {

    private String name;

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
