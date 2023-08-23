package com.eazybytes;

import com.eazybytes.beans.Person;
import com.eazybytes.beans.Vehicle;
import com.eazybytes.config.ProjectConfig;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Example12 {
    public static void main(String[] args) {

        var context = new AnnotationConfigApplicationContext(ProjectConfig.class);
        Person person = context.getBean(Person.class);

        System.out.println("Person name from Spring Context is: " + person.getName());
        System.out.println("Vehicle belong to Person is: " + person.getVehicle());
    }
}