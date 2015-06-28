package com.simundi.springboot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.context.web.SpringBootServletInitializer;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

/**
 * Created by simundi on 13/06/2015.
 */
@Configuration
@EnableAutoConfiguration
@ComponentScan(basePackages = "com.simundi.springboot")
public class SpringBootJerseyApplication extends SpringBootServletInitializer {

    public static void main(String[] args) {
        SpringApplication.run(SpringBootJerseyApplication.class, args);
    }

}
