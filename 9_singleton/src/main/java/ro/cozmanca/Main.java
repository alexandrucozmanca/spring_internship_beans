package ro.cozmanca;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import ro.cozmanca.configs.ProjectConfig;
import ro.cozmanca.models.SingletonService;
import ro.cozmanca.services.ServiceWithDependencies1;
import ro.cozmanca.services.ServiceWithDependencies2;
import ro.cozmanca.services.StereotypeSingletonService;

public class Main {
    public static void main(String[] args) {
        var context = new AnnotationConfigApplicationContext(ProjectConfig.class);

        var singletonService1 = context.getBean(SingletonService.class);
        var singletonService2 = context.getBean(SingletonService.class);

        boolean theSameSingleton = singletonService1.equals(singletonService2);
        System.out.println("The 2 variables refer to the same @bean singleton: " + theSameSingleton);

        var stereotypeSingletonService1 = context.getBean(StereotypeSingletonService.class);
        var stereotypeSingletonService2 = context.getBean(StereotypeSingletonService.class);

        theSameSingleton = stereotypeSingletonService1.equals(stereotypeSingletonService2);
        System.out.println("The 2 variables refer to the same stereotype singleton: " + theSameSingleton);

        var singletonDependencyRepository1 = context.getBean(ServiceWithDependencies1.class).getRepository();
        var singletonDependencyRepository2 = context.getBean(ServiceWithDependencies2.class).getRepository();

        theSameSingleton = singletonDependencyRepository1.equals(singletonDependencyRepository2);
        System.out.println("The 2 variables refer to the same dependency singleton: " + theSameSingleton);
    }
}
