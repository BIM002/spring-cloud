package com.sirius.ribbon.service;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class RibbonService {
    @Autowired
    RestTemplate restTemplate;

    @HystrixCommand(fallbackMethod = "sayError")
    public String sayHello(String name) {
        return restTemplate.getForObject("http://eureka-client/hello?name=" + name, String.class);
    }

    public String sayError(String name) {
        return "sorry," + name;
    }
}
