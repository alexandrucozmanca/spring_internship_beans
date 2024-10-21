package ro.cozmanca.configs;

import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;
import ro.cozmanca.services.PrototypeService;

@Configuration
@ComponentScan(basePackages = {"ro.cozmanca.repositories", "ro.cozmanca.services"})
public class ProjectConfig {
    @Bean
    @Scope(BeanDefinition.SCOPE_PROTOTYPE)
    PrototypeService prototypeService() {
        return new PrototypeService();
    }
}
