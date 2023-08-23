package com.eazybytes.config;

import com.eazybytes.beans.Vehicle;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ProjectConfig {

    @Bean
    Vehicle vehicle() {
        var veh = new Vehicle();
        veh.setName("Audi Q5");
        return veh;
    }

    @Bean
    String hello() {
        return "Hello Audi";
    }

    @Bean
    Integer number() {
        return 16;
    }
}
