package ro.cozmanca.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

@Configuration
@ComponentScan(basePackages = {"ro.cozmanca.services", "ro.cozmanca.aspects", "ro.cozmanca.annotations"})
@EnableAspectJAutoProxy
public class ProjectConfig {
}
