package ro.cozmanca.config;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;
import ro.cozmanca.bean.multiple.MultipleCar;
import ro.cozmanca.bean.multiple.MultipleCompany;

@Configuration
@ComponentScan(basePackages = "ro.cozmanca.bean")
public class ProjectConfig {

    @Primary
    @Bean()
    public MultipleCar primaryBean() {
        return new MultipleCar("Primary Multiple Car");
    }

    @Bean()
    public MultipleCar secondMultipleBean() {
        return new MultipleCar("Second Multiple Car");
    }

    @Bean(name = "third_multiple_car")
    public MultipleCar thirdMultipleBean() {
        return new MultipleCar("Third Multiple Car");
    }

    @Bean
    public MultipleCompany multipleCompanyWithPrimaryCar(MultipleCar multipleCar) {
        return new MultipleCompany("multipleCompanyWithPrimaryCar", multipleCar);
    }

    @Bean
    public MultipleCompany multipleCompanyWithSecondMultipleBean(@Qualifier("secondMultipleBean") MultipleCar secondMultipleBean) {
        return new MultipleCompany("multipleCompanyWithSecondMultipleBean", secondMultipleBean);
    }
}
