package com.example.serviceLocator.service;

import org.springframework.stereotype.Service;

@Service("cinema")
public class MoviesService implements AdapterService{
    @Override
    public String process() {
        return "Me voy al cine.";
    }
}
