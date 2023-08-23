package com.eazybytes.config;

import com.eazybytes.beans.Vehicle;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ProjectConfig {

    @Bean("audiVehicle")
    Vehicle vehicle1() {
        var veh = new Vehicle();
        veh.setName("Audi Q5");
        return veh;
    }

    @Bean("ferrariVehicle")
    Vehicle vehicle2() {
        var veh = new Vehicle();
        veh.setName("Ferrari");
        return veh;
    }

    @Bean("bmwVehicle")
    Vehicle vehicle3() {
        var veh = new Vehicle();
        veh.setName("BMW");
        return veh;
    }


}
