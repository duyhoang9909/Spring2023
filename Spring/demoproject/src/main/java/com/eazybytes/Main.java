package com.eazybytes;

import com.eazybytes.beans.Vehicle;
import com.eazybytes.config.ProjectConfig;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {

        // non-application context
        Vehicle vehicle = new Vehicle();
        vehicle.setName("Huyndai Tucson");
        System.out.println("Vehicle name from non-spring context: " + vehicle.getName());

        // spring application context
        var context = new AnnotationConfigApplicationContext(ProjectConfig.class);
        Vehicle veh = context.getBean(Vehicle.class);
        System.out.println("Vehicle name from Spring context: " + veh.getName());

        String hello = context.getBean(String.class);
        System.out.println("String from Spring context: " + hello);

        Integer num = context.getBean(Integer.class);
        System.out.println("Integer from Spring context: " + num);

    }
}