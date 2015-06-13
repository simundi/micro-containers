package com.simundi.wildflywarm;

import org.wildfly.swarm.container.Container;
import org.wildfly.swarm.jaxrs.JAXRSDeployment;

/**
 * Just here for reference. Not being used at moment.
 * Created by simundi on 14/06/2015.
 */

public class SwarmMain {

    public static void main(String[] args) throws Exception {

        Container container = new Container();

        JAXRSDeployment deployment = new JAXRSDeployment(container);
        deployment.addResource(SwarmResource.class);

        container.start().deploy(deployment);
    }

}
