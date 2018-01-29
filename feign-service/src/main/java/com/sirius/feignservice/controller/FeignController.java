package com.sirius.feignservice.controller;

import com.sirius.feignservice.service.FeignService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FeignController {

    @Autowired
    FeignService feignService;

    @RequestMapping(value = "/hello",method = RequestMethod.GET)
    public String sayHello(@RequestParam(value = "name") String name){
        return feignService.sayHelloEurekaClient(name);
    }
}