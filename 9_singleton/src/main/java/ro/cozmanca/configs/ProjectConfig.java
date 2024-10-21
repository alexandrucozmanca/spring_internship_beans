package ro.cozmanca.configs;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import ro.cozmanca.models.SingletonService;

@Configuration
@ComponentScan(basePackages = {"ro.cozmanca.services", "ro.cozmanca.repositories"})
public class ProjectConfig {

    @Bean
    SingletonService singletonService() {
        return new SingletonService("SingletonService");
    }
}
