package com.onestop.starter.common.core;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages = {"com.onestop"})
public class StarterCoreApplication {
    public static void main(String[] args) {
        SpringApplication.run(StarterCoreApplication.class, args);
    }
}
