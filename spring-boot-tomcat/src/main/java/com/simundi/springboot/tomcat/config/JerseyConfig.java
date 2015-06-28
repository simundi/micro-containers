package com.simundi.springboot.tomcat.config;

import com.simundi.springboot.tomcat.resources.HelloResource;
import org.glassfish.jersey.server.ResourceConfig;

import javax.inject.Named;

/**
 * Created by simundi on 13/06/2015.
 */
//@Component
@Named
public class JerseyConfig extends ResourceConfig {

    public JerseyConfig() {
        register(HelloResource.class);
    }

}
