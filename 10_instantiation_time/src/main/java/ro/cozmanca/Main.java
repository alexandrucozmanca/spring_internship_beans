package ro.cozmanca;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import ro.cozmanca.configs.ProjectConfig;
import ro.cozmanca.services.LazyService;

public class Main
{
    public static void main( String[] args ) {
        var context =  new AnnotationConfigApplicationContext(ProjectConfig.class);

        System.out.println("Eager Service has been initialized even thou nothing is using it");

        var lazyService = context.getBean(LazyService.class);
        System.out.println("Lazy Service has been initialized only after referring it");
    }
}
