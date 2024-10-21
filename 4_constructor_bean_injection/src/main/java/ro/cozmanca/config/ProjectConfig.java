package ro.cozmanca.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import ro.cozmanca.bean.Car;
import ro.cozmanca.bean.Company;

@Configuration
@ComponentScan(basePackages = "ro.cozmanca.bean")
public class ProjectConfig {

    @Bean
    Car car() {
        return new Car("Parameter Car");
    }

    @Bean
    Company company(Car car) {
        return new Company("Owner Company", car);
    }
}
