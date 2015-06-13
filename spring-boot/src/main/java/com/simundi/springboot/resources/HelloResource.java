package com.simundi.springboot.resources;

import javax.ws.rs.GET;
import javax.ws.rs.Path;

/**
 * Created by simundi on 13/06/2015.
 */
@Path("/spring-boot")
public class HelloResource {

    @GET
    @Path("/hello")
    public String hello() {
        return "Look mom, without hands!!!";
    }
}
