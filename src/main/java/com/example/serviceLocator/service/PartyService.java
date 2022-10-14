package com.example.serviceLocator.service;

import org.springframework.stereotype.Service;

@Service("party")
public class PartyService implements AdapterService{
    @Override
    public String process() {
        return "Estoy de fiesta.";
    }
}
