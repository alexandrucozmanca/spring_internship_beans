package ro.cozmanca.configs;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

@Configuration
@ComponentScan(basePackages = {"ro.cozmanca.aspects", "ro.cozmanca.services", "ro.cozmanca.annotations"})
@EnableAspectJAutoProxy
public class ProjectConfig {
}
