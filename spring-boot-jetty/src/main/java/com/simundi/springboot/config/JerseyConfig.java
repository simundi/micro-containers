package com.simundi.springboot.config;

import com.simundi.springboot.resources.HelloResource;
import org.glassfish.jersey.server.ResourceConfig;
import org.springframework.stereotype.Component;

/**
 * Created by simundi on 13/06/2015.
 */
@Component
public class JerseyConfig extends ResourceConfig {

    public JerseyConfig() {
        register(HelloResource.class);
    }

}
