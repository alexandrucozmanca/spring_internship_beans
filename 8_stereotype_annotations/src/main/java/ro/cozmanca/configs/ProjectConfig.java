package ro.cozmanca.configs;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan (basePackages = {"ro.cozmanca.proxies", "ro.cozmanca.repositories", "ro.cozmanca.services"})
public class ProjectConfig {
}
