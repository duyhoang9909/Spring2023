package com.eazybytes.config;

import com.eazybytes.beans.Person;
import com.eazybytes.beans.Vehicle;
import org.springframework.context.annotation.*;
import org.springframework.stereotype.Component;

@Configuration
@ComponentScan(basePackages = {"com.eazybytes.implementation",
        "com.eazybytes.services", "com.eazybytes.aspects"})
@EnableAspectJAutoProxy
public class ProjectConfig {

}
