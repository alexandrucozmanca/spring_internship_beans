package ro.cozmanca.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import ro.cozmanca.beans.Car;
import ro.cozmanca.beans.Company;

@Configuration
public class ProjectConfig {


    @Bean
    public Car car() {
        return new Car("Direct Bean Car");
    }
    @Bean
    public Company company() {
        return new Company("Owner Company", car());
    }
}
