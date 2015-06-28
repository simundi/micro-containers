package com.simundi.springboot.services;

import javax.inject.Named;

/**
 * Created by simundi on 26/06/2015.
 */
@Named("english")
public class EnglishHelloService implements HelloService {
    @Override
    public String hello() {
        return "Hey you! Hello";
    }
}
