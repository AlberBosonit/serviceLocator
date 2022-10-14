package com.example.serviceLocator.registry;

import com.example.serviceLocator.service.AdapterService;

public interface ServiceRegistry {

    AdapterService getService(String plan);
}
