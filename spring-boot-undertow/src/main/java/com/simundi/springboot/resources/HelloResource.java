package com.simundi.springboot.resources;

import com.simundi.springboot.services.HelloService;

import javax.inject.Inject;
import javax.inject.Named;
import javax.ws.rs.GET;
import javax.ws.rs.Path;

/**
 * Created by simundi on 13/06/2015.
 */
@Path("/spring-boot")
@Named
public class HelloResource {

    @Inject
    @Named("portuguese")
    HelloService helloService;

    @GET
    @Path("/hello")
    public String hello() {
        return helloService.hello();
    }
}
