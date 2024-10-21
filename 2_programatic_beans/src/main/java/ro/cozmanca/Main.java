package ro.cozmanca;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import ro.cozmanca.beans.ProgrammaticBean;
import ro.cozmanca.config.ProjectConfig;

import java.util.function.Supplier;

public class Main
{
    public static void main( String[] args ) {
        var context = new AnnotationConfigApplicationContext(ProjectConfig.class);

        ProgrammaticBean programmaticBean = new ProgrammaticBean("Name_programatic");
        Supplier<ProgrammaticBean> supplier1 = () -> programmaticBean;

        context.registerBean("programaticBean1", ProgrammaticBean.class, supplier1);

        ProgrammaticBean primaryBean = new ProgrammaticBean("primaryBean");
        Supplier<ProgrammaticBean> primarySupplier = () -> primaryBean;

        // this. will register this bean as the primary bean
        context.registerBean(null, ProgrammaticBean.class, primarySupplier, beanDefinition -> beanDefinition.setPrimary(true));


        ProgrammaticBean contextParrot = context.getBean("programaticBean1", ProgrammaticBean.class);

        System.out.println(contextParrot);
        System.out.println(contextParrot.getName());

        ProgrammaticBean contextPrimaryParrot = context.getBean( ProgrammaticBean.class);
        System.out.println(contextPrimaryParrot);
        System.out.println(contextPrimaryParrot.getName());

        ProgrammaticBean greenBean = new ProgrammaticBean("greenBean");
        greenBean.setColor("Green");
        greenBean.setName("GreenBean");

        Supplier<ProgrammaticBean> greenBeanSupplier = () -> greenBean;

        ProgrammaticBean blueBean = new ProgrammaticBean("blueBean");
        blueBean.setColor("Blue");
        blueBean.setName("BlueBean");

        Supplier<ProgrammaticBean> blueBeanSupplier = () -> blueBean;

        var wantBlue = true;

        if (wantBlue) {
            context.registerBean("coloredBean", ProgrammaticBean.class, blueBeanSupplier);
        } else {
            context.registerBean("coloredBean", ProgrammaticBean.class, greenBeanSupplier);
        }

        ProgrammaticBean coloredBean = context.getBean("coloredBean", ProgrammaticBean.class);
        System.out.println(coloredBean);
        System.out.println(coloredBean.getName());
        System.out.println(coloredBean.getColor());
    }
}
