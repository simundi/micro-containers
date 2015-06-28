package com.simundi.springboot.tomcat;

import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.context.web.SpringBootServletInitializer;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

/**
 * Created by simundi on 13/06/2015.
 */
@Configuration
@EnableAutoConfiguration
@ComponentScan(basePackages = "com.simundi.springboot.tomcat")
public class SpringBootJerseyTomcatApplication extends SpringBootServletInitializer {

    public static void main(String[] args) {
        new SpringBootJerseyTomcatApplication().configure(
                new SpringApplicationBuilder(SpringBootJerseyTomcatApplication.class)).run(args);
    }

    protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
        return application.sources(SpringBootJerseyTomcatApplication.class);
    }
}
