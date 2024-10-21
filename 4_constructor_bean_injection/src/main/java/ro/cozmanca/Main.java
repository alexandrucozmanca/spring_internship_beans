package ro.cozmanca;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import ro.cozmanca.bean.Car;
import ro.cozmanca.bean.Company;
import ro.cozmanca.config.ProjectConfig;

public class Main
{
    public static void main( String[] args ) {
        var context = new AnnotationConfigApplicationContext(ProjectConfig.class);

        Car car = context.getBean(Car.class);
        System.out.println(car);
        Company company = context.getBean(Company.class);
        System.out.println(company);
    }
}
