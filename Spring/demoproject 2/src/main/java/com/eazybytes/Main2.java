package com.eazybytes;

import com.eazybytes.beans.Vehicle;
import com.eazybytes.config.ProjectConfig;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main2 {
    public static void main(String[] args) {

        // spring application context
        var context = new AnnotationConfigApplicationContext(ProjectConfig.class);
        Vehicle veh = context.getBean("vehicle1", Vehicle.class);
        System.out.println("Vehicle name from Spring context: " + veh.getName());



    }
}