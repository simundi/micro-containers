package com.simundi.springboot.services;

import javax.inject.Named;

/**
 * Created by simundi on 26/06/2015.
 */
@Named("portuguese")
public class PortuguesHelloService implements HelloService {
    @Override
    public String hello() {
        return "Dae guri!! Blz?";
    }
}
