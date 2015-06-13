package com.simundi.dropwizard.resources;

import com.codahale.metrics.annotation.Timed;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

/**
 * Created by simundi on 13/06/2015.
 */
@Produces(MediaType.APPLICATION_JSON)
@Path("/dropwizard")
public class HelloResource {

    @GET
    @Path("/hello")
    @Timed
    public String hello() {
        return "Fuck off, it' Saturday!";
    }
}
