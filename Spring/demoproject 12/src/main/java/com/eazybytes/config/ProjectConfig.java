package com.eazybytes.config;

import com.eazybytes.beans.Person;
import com.eazybytes.beans.Vehicle;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

@Configuration
@ComponentScan(basePackages = "com.eazybytes.beans")
public class ProjectConfig {

    @Bean
    Vehicle vehicle1() {
        Vehicle veh = new Vehicle();
        veh.setName("Audi");
        return veh;
    }

    @Bean
    Vehicle vehicle2() {
        Vehicle veh = new Vehicle();
        veh.setName("BMW");
        return veh;
    }

    @Bean
    @Primary
    Vehicle vehicle3() {
        Vehicle veh = new Vehicle();
        veh.setName("Toyota");
        return veh;
    }

}
