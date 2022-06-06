package com.web418.servicehubbackend;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan("com.web418")
public class ServicehubbackendApplication {

    public static void main(String[] args) {
        SpringApplication.run(ServicehubbackendApplication.class, args);
    }

}