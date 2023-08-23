package com.eazybytes;

import com.eazybytes.beans.Vehicle;
import com.eazybytes.config.ProjectConfig;
import org.springframework.beans.factory.NoSuchBeanDefinitionException;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.Random;
import java.util.function.Supplier;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Example7 {
    public static void main(String[] args) {

        var context = new AnnotationConfigApplicationContext(ProjectConfig.class);

        Vehicle volkswagen = new Vehicle();
        volkswagen.setName("Volkswagen");
        Supplier<Vehicle> volkswagenSuppiler = () -> volkswagen;

        Supplier<Vehicle> audiSupplier = () -> {
            Vehicle audi = new Vehicle();
            audi.setName("Audi");
            return audi;
        };

        Random random = new Random();
        int randomNumber = random.nextInt(10);
        System.out.println("randomNumber = " + randomNumber);

        if (randomNumber % 2 == 0) {
            context.registerBean("volkswagen", Vehicle.class, volkswagenSuppiler);
        } else {
            context.registerBean("audi", Vehicle.class, audiSupplier);
        }

        Vehicle volksVehicle = null;
        Vehicle audiVehicle = null;

        try {
            volksVehicle = context.getBean("volkswagen", Vehicle.class);
        } catch (NoSuchBeanDefinitionException noSuchBeanDefinitionException) {
            System.out.println("Error when creating Volkswagen vehicle");
        }

        try {
            audiVehicle = context.getBean("audi", Vehicle.class);
        } catch (NoSuchBeanDefinitionException noSuchBeanDefinitionException) {
            System.out.println("Error when creating Audi vehicle");
        }

        if (null != volksVehicle) {
            System.out.println("Programming Vehicle name from Spring Context is: " + volksVehicle.getName());
        } else {
            System.out.println("Programming Vehicle name from Spring Context is: " + audiVehicle.getName());
        }
    }
}