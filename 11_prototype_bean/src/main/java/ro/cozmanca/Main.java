package ro.cozmanca;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import ro.cozmanca.configs.ProjectConfig;
import ro.cozmanca.services.PrototypeService;
import ro.cozmanca.services.SecondStereotypeService;
import ro.cozmanca.services.StereotypeService;

public class Main
{
    public static void main( String[] args ) {
        var context = new AnnotationConfigApplicationContext(ProjectConfig.class);

        var service1 = context.getBean(PrototypeService.class);
        var service2 = context.getBean(PrototypeService.class);

        boolean isTheSame = service1.equals(service2);
        System.out.println("Because the services hava a prototype scope the .equals results in " + isTheSame);

        var stereotypeService1 = context.getBean(StereotypeService.class);
        var stereotypeService2 = context.getBean(SecondStereotypeService.class);

        boolean isTheSameStereotypeRepository = stereotypeService1.getStereotypeRepository().equals(stereotypeService2.getStereotypeRepository());

        System.out.println("Stereotype repositories are the same: " + isTheSameStereotypeRepository);
    }
}
