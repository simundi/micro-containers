package com.simundi.springboot.tomcat.resources;

import javax.ws.rs.GET;
import javax.ws.rs.Path;

/**
 * Created by simundi on 13/06/2015.
 */
@Path("/spring-boot")
public class HelloResource {

    public static final String LOOK_MOM_WITHOUT_HANDS = "Look mom, without hands!!!";

    @GET
    @Path("/hello")
    public String hello() {
        return LOOK_MOM_WITHOUT_HANDS;
    }
}
