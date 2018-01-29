package com.sirius.ribbon.controller;

import com.sirius.ribbon.service.RibbonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RibbonController {
    @Autowired
    RibbonService ribbonService;

    @RequestMapping(value = "/hello")
    public String sayHello(@RequestParam String name){
        return  ribbonService.sayHello(name);
    }
}
