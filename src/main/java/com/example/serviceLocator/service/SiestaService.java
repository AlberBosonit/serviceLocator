package com.example.serviceLocator.service;

import org.springframework.stereotype.Service;

@Service("siesta")
public class SiestaService implements AdapterService{
    @Override
    public String process() {
        return "Estoy durmiendo la siesta.";
    }
}
