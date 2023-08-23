package com.eazybytes;

import com.eazybytes.config.ProjectConfig;
import com.eazybytes.services.VehicleServices;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Example14 {
    public static void main(String[] args) {

        var context = new AnnotationConfigApplicationContext(ProjectConfig.class);
        VehicleServices vehicleServices1 = context.getBean(VehicleServices.class);
        VehicleServices vehicleServices2 = context.getBean("vehicleServices", VehicleServices.class);
        System.out.println("Hashcode of Object vehicleService1: " + vehicleServices1.hashCode());
        System.out.println("Hashcode of Object vehicleService2: " + vehicleServices2.hashCode());
        if (vehicleServices1 == vehicleServices2) {
            System.out.println("VehicleServices bean is singleton scoped bean");
        }
    }
}