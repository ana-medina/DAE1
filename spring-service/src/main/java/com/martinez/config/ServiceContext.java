package com.martinez.config;

import com.martinez.persistence.PersistenceJPAConfig;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

@Configuration
@Import(PersistenceJPAConfig.class)
@ComponentScan(basePackages = "com.martinez.service")
public class ServiceContext {
}
