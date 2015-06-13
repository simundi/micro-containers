package com.simundi.dropwizard.healthcheck;

import com.codahale.metrics.health.HealthCheck;

/**
 * Created by simundi on 13/06/2015.
 */
public class HealthyHealthCheck extends HealthCheck {
    @Override
    protected Result check() throws Exception {
        return Result.healthy("I'm felling awesome!");
    }
}
