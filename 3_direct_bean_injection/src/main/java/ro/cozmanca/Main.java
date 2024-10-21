package ro.cozmanca;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import ro.cozmanca.beans.Car;
import ro.cozmanca.beans.Company;
import ro.cozmanca.config.ProjectConfig;

public class Main
{
    public static void main( String[] args ) {
        var context = new AnnotationConfigApplicationContext(ProjectConfig.class);

        Car car = context.getBean(Car.class);
        Company company = context.getBean(Company.class);

        System.out.println(car);
        System.out.println(company);
    }
}
