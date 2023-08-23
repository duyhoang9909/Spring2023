package com.eazybytes;

import com.eazybytes.beans.Person;
import com.eazybytes.beans.Vehicle;
import com.eazybytes.config.ProjectConfig;
import com.eazybytes.services.VehicleServices;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Example16 {
    public static void main(String[] args) {

        var context = new AnnotationConfigApplicationContext(ProjectConfig.class);
        VehicleServices vehicleServices1 = context.getBean(VehicleServices.class);
        VehicleServices vehicleServices2 = context.getBean("vehicleServices",VehicleServices.class);
        VehicleServices vehicleServices3 = context.getBean("vehicleServices", VehicleServices.class);

        Vehicle vehicle1 = context.getBean(Vehicle.class);
        Vehicle vehicle2 = context.getBean(Vehicle.class);

        int hashCodeVehicleService1 = vehicle1.getVehicleService().hashCode();
        int hashCodeVehicleService2 = vehicle2.getVehicleService().hashCode();

        System.out.println("Hashcode of service vehicle1: " + hashCodeVehicleService1);
        System.out.println("Hashcode of service vehicle2: " + hashCodeVehicleService2);

        System.out.println("Hashcode of the object vehicleServices1: " + vehicleServices1.hashCode());
        System.out.println("Hashcode of the object vehicleServices2: " + vehicleServices2.hashCode());
        System.out.println("Hashcode of the object vehicleServices3: " + vehicleServices3.hashCode());
        if (vehicleServices1 == vehicleServices2) {
            System.out.println("VehicleServices bean is a singleton scoped bean.");
        } else {
            System.out.println("VehicleServices bean is a prototype scoped bean.");
        }
    }
}