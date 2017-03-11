package mx.uerre.config;

import mx.uerre.persistence.PersistenceJPAConfig;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

@Configuration
@Import(PersistenceJPAConfig.class)
@ComponentScan(basePackages = "mx.uerre.service")
public class ServiceContext {
}
