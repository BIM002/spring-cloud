package com.sirius.feignservice.service;

import org.springframework.stereotype.Component;

@Component
public class FeignServiceHystric implements FeignService {

    @Override
    public String sayHelloEurekaClient(String name) {
        return "sorry," + name;
    }
}
