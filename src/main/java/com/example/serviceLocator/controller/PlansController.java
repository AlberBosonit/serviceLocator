package com.example.serviceLocator.controller;

import com.example.serviceLocator.registry.ServiceRegistry;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PlansController {

    @Autowired
    private ServiceRegistry serviceRegistry;


    //GET http://localhost:8080/fiesta
    @GetMapping("{plan}")
    public String processGet(@PathVariable String plan){
        return serviceRegistry.getService(plan).process();
    }

}
