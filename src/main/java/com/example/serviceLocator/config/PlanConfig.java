package com.example.serviceLocator.config;

import com.example.serviceLocator.registry.ServiceRegistry;
import org.springframework.beans.factory.FactoryBean;
import org.springframework.beans.factory.config.ServiceLocatorFactoryBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class PlanConfig {

    @Bean
    public FactoryBean<?> factoryBean(){
        ServiceLocatorFactoryBean slfBean = new ServiceLocatorFactoryBean();
        slfBean.setServiceLocatorInterface(ServiceRegistry.class);
        return slfBean;
    }
}
