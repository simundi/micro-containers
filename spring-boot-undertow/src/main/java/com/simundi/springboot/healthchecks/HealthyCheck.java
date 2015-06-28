package com.simundi.springboot.healthchecks;

import org.springframework.boot.actuate.health.Health;
import org.springframework.boot.actuate.health.HealthIndicator;

import javax.inject.Named;

/**
 * Created by simundi on 13/06/2015.
 */
@Named
public class HealthyCheck implements HealthIndicator {
    @Override
    public Health health() {
        return Health.up().withDetail("I'm UP", "Freacking awesome!").build();
    }
}
