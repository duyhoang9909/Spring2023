package com.eazybytes;

import com.eazybytes.beans.Vehicle;
import com.eazybytes.config.ProjectConfig;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Example3 {
    public static void main(String[] args) {

        // spring application context
        var context = new AnnotationConfigApplicationContext(ProjectConfig.class);

        Vehicle veh1 = context.getBean("audiVehicle", Vehicle.class);
        System.out.println("Vehicle name Audi from Spring context: " + veh1.getName());

        Vehicle veh2 = context.getBean("ferrariVehicle", Vehicle.class);
        System.out.println("Vehicle name Ferrari from Spring context: " + veh2.getName());

        Vehicle veh3 = context.getBean("bmwVehicle", Vehicle.class);
        System.out.println("Vehicle name BMW from Spring context: " + veh3.getName());


    }
}