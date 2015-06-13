package com.simundi.springboot.healthchecks;

import org.springframework.boot.actuate.health.Health;
import org.springframework.boot.actuate.health.HealthIndicator;
import org.springframework.stereotype.Component;

/**
 * Created by simundi on 13/06/2015.
 */
@Component
public class HealthyCheck implements HealthIndicator {
    @Override
    public Health health() {
        return Health.up().withDetail("UP", "Feacking awesome!").build();
    }
}
