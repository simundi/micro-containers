package com.simundi.springboot;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.context.web.SpringBootServletInitializer;

/**
 * Created by simundi on 13/06/2015.
 */
@SpringBootApplication
public class SpringBootJerseyApplication extends SpringBootServletInitializer {

    public static void main(String[] args) {
        new SpringBootJerseyApplication().configure(
                new SpringApplicationBuilder(SpringBootJerseyApplication.class)).run(args);
    }

    protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
        return application.sources(SpringBootJerseyApplication.class);
    }
}
