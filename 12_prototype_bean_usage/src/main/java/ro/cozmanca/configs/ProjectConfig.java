package ro.cozmanca.configs;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = {"ro.cozmanca.services", "ro.cozmanca.processors", "ro.cozmanca.repositories"})
public class ProjectConfig {
}
