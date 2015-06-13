package com.simundi.dropwizard;

import com.simundi.dropwizard.healthcheck.HealthyHealthCheck;
import com.simundi.dropwizard.resources.HelloResource;
import io.dropwizard.Application;
import io.dropwizard.setup.Environment;

/**
 * Created by simundi on 27/12/2014.
 */
public class DropwizardApplication extends Application<DropwizardConfiguration> {

    public static void main(String[] args) throws Exception {
        new DropwizardApplication().run(args);
    }


    @Override
    public void run(DropwizardConfiguration configuration,
                    Environment environment) {

        environment.jersey().register(new HelloResource());
        environment.healthChecks().register("How do you feel?", new HealthyHealthCheck());

    }


}
