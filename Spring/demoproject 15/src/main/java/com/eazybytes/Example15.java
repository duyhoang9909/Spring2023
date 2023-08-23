package com.eazybytes;

import com.eazybytes.beans.Person;
import com.eazybytes.config.ProjectConfig;
import com.eazybytes.services.VehicleServices;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Example15 {
    public static void main(String[] args) {

        var context = new AnnotationConfigApplicationContext(ProjectConfig.class);
        System.out.println("Before retriving the Person bean from the Spring Context");
        Person person = context.getBean(Person.class);
        System.out.println("After retriving the Person bean from the Spring Context");
    }
}