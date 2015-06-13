package com.simundi.wildflywarm;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;

/**
 * Created by simundi on 13/06/2015.
 */
@Path("/hello")
public class SwarmResource {

    @GET
    @Produces("text/plain")
    public String hello() {
        return "Helloooo Nurse!";
    }
}
