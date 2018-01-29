package com.sirius.feignservice.service;

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@FeignClient(value = "eureka-client", fallback = FeignServiceHystric.class)
public interface FeignService {

    @RequestMapping(value = "/hello", method = RequestMethod.GET)
    String sayHelloEurekaClient(@RequestParam(value = "name") String name);
}
